import java.util.Objects;
import org.sql2o.*;

public class Animal {
    private String name;
    private int id;
    private String type;
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

//    // database setup
//    @Override
//    public void save(){
//        try(Connection con = DB.sql2o.open()){
//            String sql = "INSERT INTO animals(name,type) VALUES(:name,:type)";
//                    this.id = (int) con.createQuery(sql, true)
//                            .addParameter("name",this.name)
//                            .addParameter("type",this.type)
//                            .executeUpdate()
//                            .getKey();
//        }
//    }
}
