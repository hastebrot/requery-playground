// Generated file do not edit, generated by io.requery.processor.EntityProcessor
package hastebrot.playground.requery.modeljpa;

import io.requery.Persistable;
import io.requery.meta.Attribute;
import io.requery.meta.AttributeBuilder;
import io.requery.meta.Cardinality;
import io.requery.meta.QueryAttribute;
import io.requery.meta.Type;
import io.requery.meta.TypeBuilder;
import io.requery.proxy.EntityProxy;
import io.requery.proxy.IntProperty;
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
public class AddressEntity implements Address, Persistable {
    public static final Attribute<AddressEntity, Person> PERSON = 
    new AttributeBuilder<AddressEntity, Person>("person", Person.class)
    .setProperty(new Property<AddressEntity, Person>() {
        @Override
        public Person get(AddressEntity entity) {
            return entity.person;
        }

        @Override
        public void set(AddressEntity entity, Person value) {
            entity.person = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$person_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$person_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(true)
    .setCardinality(Cardinality.ONE_TO_ONE)
    .setMappedAttribute(new Supplier<Attribute>() {
        @Override
        public Attribute get() {
            return PersonEntity.ADDRESS;
        }
    })
    .build();

    public static final QueryAttribute<AddressEntity, String> ZIP = 
    new AttributeBuilder<AddressEntity, String>("zip", String.class)
    .setProperty(new Property<AddressEntity, String>() {
        @Override
        public String get(AddressEntity entity) {
            return entity.zip;
        }

        @Override
        public void set(AddressEntity entity, String value) {
            entity.zip = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$zip_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$zip_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setLength(5)
    .build();

    public static final QueryAttribute<AddressEntity, String> COUNTRY = 
    new AttributeBuilder<AddressEntity, String>("country", String.class)
    .setProperty(new Property<AddressEntity, String>() {
        @Override
        public String get(AddressEntity entity) {
            return entity.country;
        }

        @Override
        public void set(AddressEntity entity, String value) {
            entity.country = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$country_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$country_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .setLength(2)
    .build();

    public static final QueryAttribute<AddressEntity, AddressType> TYPE = 
    new AttributeBuilder<AddressEntity, AddressType>("type", AddressType.class)
    .setProperty(new Property<AddressEntity, AddressType>() {
        @Override
        public AddressType get(AddressEntity entity) {
            return entity.type;
        }

        @Override
        public void set(AddressEntity entity, AddressType value) {
            entity.type = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$type_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$type_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<AddressEntity, String> LINE1 = 
    new AttributeBuilder<AddressEntity, String>("line1", String.class)
    .setProperty(new Property<AddressEntity, String>() {
        @Override
        public String get(AddressEntity entity) {
            return entity.line1;
        }

        @Override
        public void set(AddressEntity entity, String value) {
            entity.line1 = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$line1_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$line1_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<AddressEntity, String> CITY = 
    new AttributeBuilder<AddressEntity, String>("city", String.class)
    .setProperty(new Property<AddressEntity, String>() {
        @Override
        public String get(AddressEntity entity) {
            return entity.city;
        }

        @Override
        public void set(AddressEntity entity, String value) {
            entity.city = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$city_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$city_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<AddressEntity, String> LINE2 = 
    new AttributeBuilder<AddressEntity, String>("line2", String.class)
    .setProperty(new Property<AddressEntity, String>() {
        @Override
        public String get(AddressEntity entity) {
            return entity.line2;
        }

        @Override
        public void set(AddressEntity entity, String value) {
            entity.line2 = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$line2_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$line2_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<AddressEntity, String> STATE = 
    new AttributeBuilder<AddressEntity, String>("state", String.class)
    .setProperty(new Property<AddressEntity, String>() {
        @Override
        public String get(AddressEntity entity) {
            return entity.state;
        }

        @Override
        public void set(AddressEntity entity, String value) {
            entity.state = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$state_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$state_state = value;
        }
    })
    .setGenerated(false)
    .setLazy(false)
    .setNullable(true)
    .setUnique(false)
    .build();

    public static final QueryAttribute<AddressEntity, Integer> ID = 
    new AttributeBuilder<AddressEntity, Integer>("id", int.class)
    .setProperty(new IntProperty<AddressEntity>() {
        @Override
        public Integer get(AddressEntity entity) {
            return entity.id;
        }

        @Override
        public void set(AddressEntity entity, Integer value) {
            entity.id = value;
        }

        @Override
        public int getInt(AddressEntity entity) {
            return entity.id;
        }

        @Override
        public void setInt(AddressEntity entity, int value) {
            entity.id = value;
        }
    })
    .setPropertyState(new Property<AddressEntity, PropertyState>() {
        @Override
        public PropertyState get(AddressEntity entity) {
            return entity.$id_state;
        }

        @Override
        public void set(AddressEntity entity, PropertyState value) {
            entity.$id_state = value;
        }
    })
    .setKey(true)
    .setGenerated(true)
    .setLazy(false)
    .setNullable(false)
    .setUnique(false)
    .build();

    public static final Type<AddressEntity> $TYPE = new TypeBuilder<AddressEntity>(AddressEntity.class, "Address")
    .setBaseType(Address.class)
    .setCacheable(true)
    .setImmutable(false)
    .setReadOnly(false)
    .setStateless(false)
    .setFactory(new Supplier<AddressEntity>() {
        @Override
        public AddressEntity get() {
            return new AddressEntity();
        }
    })
    .setProxyProvider(new Function<AddressEntity, EntityProxy<AddressEntity>>() {
        @Override
        public EntityProxy<AddressEntity> apply(AddressEntity entity) {
            return entity.$proxy;
        }
    })
    .addAttribute(ZIP)
    .addAttribute(PERSON)
    .addAttribute(COUNTRY)
    .addAttribute(CITY)
    .addAttribute(STATE)
    .addAttribute(ID)
    .addAttribute(LINE1)
    .addAttribute(TYPE)
    .addAttribute(LINE2)
    .build();

    private PropertyState $person_state;

    private PropertyState $zip_state;

    private PropertyState $country_state;

    private PropertyState $type_state;

    private PropertyState $line1_state;

    private PropertyState $city_state;

    private PropertyState $line2_state;

    private PropertyState $state_state;

    private PropertyState $id_state;

    private Person person;

    private String zip;

    private String country;

    private AddressType type;

    private String line1;

    private String city;

    private String line2;

    private String state;

    private int id;

    private final transient EntityProxy<AddressEntity> $proxy = new EntityProxy<AddressEntity>(this, $TYPE);

    public AddressEntity() {
    }

    @Override
    public Person getPerson() {
        return $proxy.get(PERSON);
    }

    public void setPerson(Person person) {
        $proxy.set(PERSON, person);
    }

    @Override
    public String getZip() {
        return $proxy.get(ZIP);
    }

    public void setZip(String zip) {
        $proxy.set(ZIP, zip);
    }

    @Override
    public String getCountry() {
        return $proxy.get(COUNTRY);
    }

    public void setCountry(String country) {
        $proxy.set(COUNTRY, country);
    }

    @Override
    public AddressType getType() {
        return $proxy.get(TYPE);
    }

    public void setType(AddressType type) {
        $proxy.set(TYPE, type);
    }

    @Override
    public String getLine1() {
        return $proxy.get(LINE1);
    }

    public void setLine1(String line1) {
        $proxy.set(LINE1, line1);
    }

    @Override
    public String getCity() {
        return $proxy.get(CITY);
    }

    public void setCity(String city) {
        $proxy.set(CITY, city);
    }

    @Override
    public String getLine2() {
        return $proxy.get(LINE2);
    }

    public void setLine2(String line2) {
        $proxy.set(LINE2, line2);
    }

    @Override
    public String getState() {
        return $proxy.get(STATE);
    }

    public void setState(String state) {
        $proxy.set(STATE, state);
    }

    @Override
    public int getId() {
        return $proxy.get(ID);
    }

    public void setId(int id) {
        $proxy.set(ID, id);
    }

    @Override
    public boolean equals(Object obj) {
        return obj instanceof AddressEntity && ((AddressEntity)obj).$proxy.equals(this.$proxy);
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
