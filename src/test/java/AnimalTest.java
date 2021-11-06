import org.junit.Rule;
import org.junit.Test;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

import static org.junit.Assert.*;

public class AnimalTest {
//
//    @Rule
//    public DatabaseRule database = new DatabaseRule();
//
    @Test
    public void instantiatesCorrectly_true(){
        Animal testAnimal = new Animal("wolf");
        assertEquals(true, testAnimal instanceof Animal);
    }
    @Test
    public void Animals_instantiatesCorrectlyWithType_String(){
        Animal testAnimal = new Animal("wolf");
        assertEquals("animal",testAnimal.getType());
    }
    @Test
    public void animal_instantiatesWithName_String(){
        Animal testAnimal = new Animal("wolf");
        assertEquals("wolf",testAnimal.getName());
    }

    // overriding equals
    @Test
    public void equals_returnsTrueIfAnimalsAreSame(){
        Animal firstAnimal = new Animal("wolf");
        Animal secondAnimal = new Animal("wolf");
        assertTrue(firstAnimal.equals(secondAnimal));
    }

    //database setup
    @Test
    public void save_CorrectlyIntoTheDatabase(){
        Animal testAnimal = new Animal("wolf");
        testAnimal.save();
        assertTrue(Animal.all().get(0).equals(testAnimal));
    }

}