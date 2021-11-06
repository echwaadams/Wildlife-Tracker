import org.junit.Rule;
import org.junit.Test;

import static org.junit.Assert.*;

public class EndangeredAnimalTest {
    @Rule
    public DatabaseRule database = new DatabaseRule();

    @Test
    public void enAnimal_InstantiatesCorrectly_true(){
        EndangeredAnimal endangeredAnimal = setUpTheTask();
        assertEquals(true,endangeredAnimal instanceof EndangeredAnimal);
    }

}