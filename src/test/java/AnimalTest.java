//import org.junit.Rule;
//import org.junit.Test;
//import org.sql2o.Connection;
//import org.sql2o.Sql2o;
//
//import static org.junit.Assert.*;
//
//public class AnimalTest {
//
//    @Rule
//    public DatabaseRule database = new DatabaseRule();
//
//    @Test
//    public void instantiatesCorrectly_true(){
//        Animal testAnimal = new Animal("wolf");
//        assertEquals(true, testAnimal instanceof Animal);
//    }
//    @Test
//    public void Animals_instantiatesCorrectlyWithType_String(){
//        Animal testAnimal = new Animal("wolf");
//        assertEquals("animal",testAnimal.getType());
//    }
//    @Test
//    public void animal_instantiatesWithName_String(){
//        Animal testAnimal = new Animal("wolf");
//        assertEquals("wolf",testAnimal.getName());
//    }
//
//    // overriding equals
//    @Test
//    public void equals_returnsTrueIfAnimalsAreSame(){
//        Animal firstAnimal = new Animal("wolf");
//        Animal secondAnimal = new Animal("wolf");
//        assertTrue(firstAnimal.equals(secondAnimal));
//    }
//
//    //database setup
//    @Test
//    public void save_CorrectlyIntoTheDatabase(){
//        Animal testAnimal = new Animal("wolf");
//        testAnimal.save();
//        assertTrue(Animal.all().get(0).equals(testAnimal));
//    }
//    //returns all database entries
//      @Test
//      public void all_returnsAllInstancesOfAnimals_true(){
//          Animal firstAnimal = new Animal("wolf");
//          firstAnimal.save();
//          Animal secondAnimal = new Animal("tiger");
//          secondAnimal.save();
//          assertEquals(true,Animal.all().get(0).equals(firstAnimal));
//          assertEquals(true,Animal.all().get(1).equals(secondAnimal));
//    }
//
//    // assigning id
//    @Test
//   public void save_assignsIdToObject(){
//        Animal testAnimal = new Animal("wolf");
//        testAnimal.save();
//        Animal savedAnimal = Animal.all().get(0);
//        assertEquals(testAnimal.getId(), savedAnimal.getId());
//    }
//
//    // finding animals with an id
//    @Test
//    public void findById_returnsAnimalsWithSameID_secondAnimal(){
//        Animal firstAnimal = new Animal("wolf");
//        firstAnimal.save();
//        Animal secondAnimal = new Animal("tiger");
//        secondAnimal.save();
//        assertEquals(Animal.findById(secondAnimal.getId()),secondAnimal);
//    }
//
//}