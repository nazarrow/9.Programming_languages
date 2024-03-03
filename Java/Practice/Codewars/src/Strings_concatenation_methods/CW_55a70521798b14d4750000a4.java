package Strings_concatenation_methods;

// Task https://www.codewars.com/kata/55a70521798b14d4750000a4/train/java

// Make a function that will return a greeting statement that uses an input; your program should return, "Hello, <name> how are you doing today?".

// [Make sure you type the exact thing I wrote or the program may not execute properly]

public class CW_55a70521798b14d4750000a4 {

    public class Kata {
        public static String greet(String name) {
            return "Hello, " + name + " how are you doing today?";
        }
    }
}

// Sample Tests

// import org.junit.Test;
// import static org.junit.Assert.assertEquals;
// import org.junit.runners.JUnit4;

// public class SolutionTest {
//     @Test
//     public void testSomething() {
//         assertEquals("Hello, Ryan how are you doing today?", Kata.greet("Ryan"));
//     }
// }
