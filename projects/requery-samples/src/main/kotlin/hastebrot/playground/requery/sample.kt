package hastebrot.playground.requery

import com.zaxxer.hikari.HikariDataSource
import hastebrot.playground.requery.modeljpa.AddressEntity
import hastebrot.playground.requery.modeljpa.Models
import hastebrot.playground.requery.modeljpa.PersonEntity
import io.requery.Persistable
import io.requery.cache.EntityCacheBuilder
import io.requery.meta.EntityModel
import io.requery.sql.BoundParameters
import io.requery.sql.Configuration
import io.requery.sql.ConfigurationBuilder
import io.requery.sql.EntityDataStore
import io.requery.sql.SchemaModifier
import io.requery.sql.StatementListener
import io.requery.sql.TableCreationMode
import rx.schedulers.Schedulers
import java.sql.Statement
import javax.cache.Caching
import javax.sql.DataSource

fun main(args: Array<String>) {
    val dataSource = buildDataSource()
    val entityModel = Models.MODELJPA

    val dataStoreConfig = buildDataStoreConfig(dataSource, entityModel)
    val dataStore = EntityDataStore<Persistable>(dataStoreConfig)

    createTables(dataStoreConfig)
    runSamples(dataStore)

    dataStore.close()
}

private fun runSamples(dataStore: EntityDataStore<Persistable>) {
    dataStore.insert(PersonEntity().apply {
        age = 30
        address = AddressEntity().apply {
            city = "hamburg"
        }
    })
    dataStore.insert(PersonEntity().apply {
        age = 31
    })

    val scalar = dataStore.count(PersonEntity::class.java)
        .get()
    scalar.value().let { println(it) }

    val result = dataStore.select(PersonEntity::class.java)
        .limit(10)
        .get()
    result.forEach { println(it) }

    val countScalar = dataStore.count(PersonEntity::class.java)
        .get()
    countScalar.toSingle()
        .subscribe { println(it) }

    val selectResult = dataStore.select(PersonEntity::class.java)
        .get()
    selectResult.toObservable()
        .subscribeOn(Schedulers.io())
        .subscribe { println(it) }

    val selectResult2 = dataStore.select(PersonEntity::class.java)
        .get()
    selectResult2.toObservable()
        .subscribe {
            println(PersonEntity.AGE.property().get(it))
        }

    Models.MODELJPA
        .typeOf(PersonEntity::class.java)
        .attributes()
        .associateBy { it.name() }
        .let { println(it) }
}

private fun buildDataStoreConfig(dataSource: DataSource,
                                 entityModel: EntityModel): Configuration {
    val cacheManager = Caching.getCachingProvider().cacheManager
    val configuration = ConfigurationBuilder(dataSource, entityModel)
//        .useDefaultLogging()
        .addStatementListener(sqlStatementListener)
        .setEntityCache(EntityCacheBuilder(entityModel)
            .useReferenceCache(true)
            .useSerializableCache(true)
            .useCacheManager(cacheManager)
            .build())
        .build()
    return configuration
}

private fun createTables(configuration: Configuration) {
    val schemaModifier = SchemaModifier(configuration)
    schemaModifier.createTables(TableCreationMode.DROP_CREATE)
}

private fun buildDataSource(): DataSource {
    val dataSource = HikariDataSource()
    dataSource.jdbcUrl = "jdbc:h2:mem:samples;DB_CLOSE_DELAY=-1"
    dataSource.username = "sa"
    return dataSource
}

val sqlStatementListener = object : StatementListener {
    override fun beforeExecuteQuery(statement: Statement,
                                    sql: String,
                                    parameters: BoundParameters?) {
        println(sql)
    }

    override fun afterExecuteQuery(statement: Statement) { }

    override fun beforeExecuteUpdate(statement: Statement,
                                     sql: String,
                                     parameters: BoundParameters?) {
        println(sql)
    }

    override fun afterExecuteUpdate(statement: Statement) { }
}
