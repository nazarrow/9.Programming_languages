package Codewars;

//Task https://www.codewars.com/kata/5b077ebdaf15be5c7f000077/train/java
/*If you can't sleep, just count sheep!!

Task:
Given a non-negative integer, 3 for example, return a string with a murmur: "1 sheep...2 sheep...3 sheep...". Input will always be valid, i.e. no negative integers.*/
public class CW_5b077ebdaf15be5c7f000077 {

    //    class Kata {
    public static String countingSheep(int num) {
        String str = "";
        for (int i = 1; i <= num; i++) {
            str = str + i + " sheep...";
        }
        return str;
    }
}

//Sample Tests
/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("", Kata.countingSheep(0));
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
    }
}*/
