package Codewars;

//Task https://www.codewars.com/kata/5265326f5fda8eb1160004c8/train/java
/*We need a function that can transform a number (integer) into a string.

What ways of achieving this do you know?

Examples (input --> output):
        123  --> "123"
        999  --> "999"
        -100 --> "-100"*/
public class CW_5265326f5fda8eb1160004c8 {

    //    class Kata {
    public static String numberToString(int num) {
        return String.valueOf(num);
    }
}

//Sample Tests
/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class NumberStringExampleTests {
    @Test
    public void tests() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("123", Kata.numberToString(123));
        assertEquals("999", Kata.numberToString(999));
    }
}*/
