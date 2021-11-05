import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalTest {
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

}