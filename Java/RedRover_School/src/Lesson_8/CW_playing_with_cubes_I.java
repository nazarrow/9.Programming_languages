package Lesson_8;

//Task https://www.codewars.com/kata/playing-with-cubes-i/train/java
/*Create a public class called Cube without a constructor which gets one single private integer variable Side,
a getter GetSide() and a setter SetSide(int num) method for this property.
Actually, getter and setter methods are not the common way to write this code in C#.
In the next kata of this series, we gonna refactor the code and make it a bit more professional...

Notes:

There's no need to check for negative values!
initialise the side to 0.*/
public class CW_playing_with_cubes_I {

    public class Cube {
        int Side;

        public int getSide() {
            return Side;
        }

        public void setSide(int num) {
            Side = num;
        }
    }

}

//Sample Tests
//import org.junit.Test;
//import static org.junit.Assert.assertEquals;
//import org.junit.runners.JUnit4;
//
// TODO: Replace examples and use TDD development by writing your own tests
//
//public class SolutionTest {
//    @Test
//    public void testSetToThree() {
//        Cube c = new Cube();
//        c.setSide(3);
//        assertEquals(3, c.getSide());
//    }
//}