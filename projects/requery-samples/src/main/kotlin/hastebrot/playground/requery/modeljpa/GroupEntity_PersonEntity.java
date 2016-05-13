// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package hastebrot.playground.requery.modeljpa;

import io.requery.Persistable;
import io.requery.ReferentialAction;
import io.requery.meta.Attribute;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.QueryAttribute;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.Property;
import io.requery.proxy.PropertyState;
import io.requery.util.function.Function;
import io.requery.util.function.Supplier;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import javax.annotation.Generated;

@Generated("io.requery.processor.EntityProcessor")
public class GroupEntity_PersonEntity extends AbstractGroupEntity_PersonEntity implements Persistable {
    public static final QueryAttribute<GroupEntity_PersonEntity, Integer> PERSON_ID = 
    new AttributeBuilder<GroupEntity_PersonEntity, Integer>("personId", Integer.class)
    .setProperty(new Property<GroupEntity_PersonEntity, Integer>() {
        @Override
        public Integer get(GroupEntity_PersonEntity entity) {
            return entity.personId;
        }

        @Override
        public void set(GroupEntity_PersonEntity entity, Integer value) {
            entity.personId = value;
        }
    })
    .setPropertyState(new Property<GroupEntity_PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(GroupEntity_PersonEntity entity) {
            return entity.$personId_state;
        }

        @Override
        public void set(GroupEntity_PersonEntity entity, PropertyState value) {
            entity.$personId_state = value;
        }
    })
    .setKey(true)
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setForeignKey(true)
    .setReferencedClass(GroupEntity.class)
    .setReferencedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return GroupEntity.ID;
        }
    })
    .setDeleteAction(ReferentialAction.CASCADE)
    .setUpdateAction(ReferentialAction.CASCADE)
    .build();

    public static final QueryAttribute<GroupEntity_PersonEntity, Integer> GROUP_ID = 
    new AttributeBuilder<GroupEntity_PersonEntity, Integer>("groupId", Integer.class)
    .setProperty(new Property<GroupEntity_PersonEntity, Integer>() {
        @Override
        public Integer get(GroupEntity_PersonEntity entity) {
            return entity.groupId;
        }

        @Override
        public void set(GroupEntity_PersonEntity entity, Integer value) {
            entity.groupId = value;
        }
    })
    .setPropertyState(new Property<GroupEntity_PersonEntity, PropertyState>() {
        @Override
        public PropertyState get(GroupEntity_PersonEntity entity) {
            return entity.$groupId_state;
        }

        @Override
        public void set(GroupEntity_PersonEntity entity, PropertyState value) {
            entity.$groupId_state = value;
        }
    })
    .setKey(true)
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setForeignKey(true)
    .setReferencedClass(PersonEntity.class)
    .setReferencedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return PersonEntity.ID;
        }
    })
    .setDeleteAction(ReferentialAction.CASCADE)
    .setUpdateAction(ReferentialAction.CASCADE)
    .build();

    public static final Type<GroupEntity_PersonEntity> $TYPE = new TypeBuilder<GroupEntity_PersonEntity>(GroupEntity_PersonEntity.class, "Groups_Person")
    .setBaseType(AbstractGroupEntity_PersonEntity.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setFactory(new Supplier<GroupEntity_PersonEntity>() {
        @Override
        public GroupEntity_PersonEntity get() {
            return new GroupEntity_PersonEntity();
        }
    })
    .setProxyProvider(new Function<GroupEntity_PersonEntity, EntityProxy<GroupEntity_PersonEntity>>() {
        @Override
        public EntityProxy<GroupEntity_PersonEntity> apply(GroupEntity_PersonEntity entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(PERSON_ID)
    .addAttribute(GROUP_ID)
    .build();

    private PropertyState $personId_state;

    private PropertyState $groupId_state;

    private final transient EntityProxy<GroupEntity_PersonEntity> $proxy = new EntityProxy<GroupEntity_PersonEntity>(this, $TYPE);

    public GroupEntity_PersonEntity() {
    }

    public Integer getPersonId() {
        return $proxy.get(PERSON_ID);
    }

    public void setPersonId(Integer personId) {
        $proxy.set(PERSON_ID, personId);
    }

    public Integer getGroupId() {
        return $proxy.get(GROUP_ID);
    }

    public void setGroupId(Integer groupId) {
        $proxy.set(GROUP_ID, groupId);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof GroupEntity_PersonEntity && ((GroupEntity_PersonEntity)obj).$proxy.equals(this.$proxy);
    }

    @Override
    public int hashCode() {
        return $proxy.hashCode();
    }

    @Override
    public String toString() {
        return $proxy.toString();
    }
}
