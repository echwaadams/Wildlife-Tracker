import java.util.List;
import java.util.Objects;

import interfaces.AnimalInterface;
import org.sql2o.Connection;
import org.sql2o.*;

public class Animal implements AnimalInterface {
    public String name;
    public int id;
    public String type;
    public static final String ANIMALS_TYPE = "animal";
    public Animal(String name) {
        this.name = name;
        this.type = ANIMALS_TYPE;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    // Overriding Methods
    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;
        if(getId() != animal.getId()) return false;
        if (!getName().equals(animal.getName())) return false;
        return getType().equals(animal.getType());
    }

    // saving data into the database
    //@Override
    public void save(){
        try(Connection con = DB.sql2o.open()){
            String sql = "INSERT INTO animals(name,type) VALUES(:name,:type)";
                    this.id = (int) con.createQuery(sql, true)
                            .addParameter("name",this.name)
                            .addParameter("type",this.type)
                            .executeUpdate()
                            .getKey();
        }
    }
    // returning all database entries
    public static List<Animal> all(){
        String sql = "SELECT * FROM animals WHERE type=:type";
        try(Connection con = DB.sql2o.open()){
            return con.createQuery(sql)
                    .addParameter("type","animal")
                    .throwOnMappingFailure(false)
                    .executeAndFetch(Animal.class);
        }
    }
    public static Animal findById(int id) {
        try (Connection con = DB.sql2o.open()) {
            String sql = "SELECT * FROM animals WHERE id=:id AND type=:type";
            return con.createQuery(sql)
                    .addParameter("id", id)
                    .addParameter("type", "animal")
                    .throwOnMappingFailure(false)
                    .executeAndFetchFirst(Animal.class);
        }
    }

    public void update(String name) {
        String sql = "UPDATE animals SET name=:name WHERE id=:id";
        try (Connection conn = DB.sql2o.open()){
            conn.createQuery(sql)
                    .addParameter("name",name)
                    .addParameter("id",id)
                    .executeUpdate();
        }
    }

    public void delete() {
        try (Connection conn = DB.sql2o.open()){
            String sql = "DELETE FROM animals WHERE id=:id";
            conn.createQuery(sql)
                    .addParameter("id",this.id)
                    .executeUpdate();
        }
    }
}
