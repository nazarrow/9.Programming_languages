package Strings_concatenation_methods;

// Task https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java

/*Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.

The output should be two capital letters with a dot separating them.

It should look like this:

Sam Harris => S.H

patrick feeney => P.F*/

public class CW_57eadb7ecd143f4c9c0000a3 {

    public class AbbreviateTwoWords {

        public static String abbrevName(String name) {
            String[] fullName = name.split(" ");
            String firstName = fullName[0];
            String lastName = fullName[1];
            return (firstName.charAt(0) + "." + lastName.charAt(0)).toUpperCase();
        }
    }
}

//Sample Tests

/*
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class SolutionTest {

    @Test
    public void testFixed() {
        assertEquals("S.H", AbbreviateTwoWords.abbrevName("Sam Harris"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("Patrick Feenan"));
        assertEquals("E.C", AbbreviateTwoWords.abbrevName("Evan Cole"));
        assertEquals("P.F", AbbreviateTwoWords.abbrevName("P Favuzzi"));
        assertEquals("D.M", AbbreviateTwoWords.abbrevName("David Mendieta"));
    }
}*/
