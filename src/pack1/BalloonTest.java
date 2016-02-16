package pack1;

import static org.junit.Assert.*;
import org.junit.Test;

/**
 * Created by raugust on 2/16/2016.
 */
public class BalloonTest {

    @org.junit.Test
    public void testGetSize() throws Exception {
        // Create a default balloon
        Balloon b = new Balloon();
        //check size
        assertEquals(12, b.getSize());
        //check color
        assertEquals("blue", b.getColor());
    }
}


// to unit testing through junit4, not groovy
//go to File/Project Structure/Libraries
//    add library, go to location of intelij and junit-4.1.2 library