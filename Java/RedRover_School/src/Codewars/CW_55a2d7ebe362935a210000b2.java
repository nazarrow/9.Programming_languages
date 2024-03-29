package Codewars;

//Task https://www.codewars.com/kata/55a2d7ebe362935a210000b2/train/java
/*Given an array of integers your solution should find the smallest integer.

For example:

Given [34, 15, 88, 2] your solution will return 2
Given [34, -345, -1, 100] your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.*/
public class CW_55a2d7ebe362935a210000b2 {

    //    public class SmallestIntegerFinder {
    public static int findSmallestInt(int[] args) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < args.length; i++) {
            if (args[i] < min) {
                min = args[i];
            }
        }
        return min;
    }
}

//Sample Tests
/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SmallestIntegerFinderTest {

    @Test
    public void example1(){
        int expected = 11;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,232,12,11,43});
        assertEquals(expected, actual);
    }


    @Test
    public void example2(){
        int expected = -33;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{78,56,-2,12,8,-33});
        assertEquals(expected, actual);
    }

    @Test
    public void example3(){
        int expected = Integer.MIN_VALUE;
        int actual = SmallestIntegerFinder.findSmallestInt(new int[]{0,Integer.MIN_VALUE,Integer.MAX_VALUE});
        assertEquals(expected, actual);
    }
}*/
