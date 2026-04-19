import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;

public class PracticeTest {

    // TODO: Make more tests for maxDiff
    @Test
    void testMaxDiffPositiveAndNegative() {
        // Arrange
        int[] numbers = {8, -2, 9, -5};

        // Act
        int actual = Practice.maxDiff(numbers);

        // Assert
        // Largest: 9, Smallest: -5, Difference: 9 - -5 = 14
        assertEquals(14, actual);
    }
    

    // TODO: Make tests for each problem you solve

    // testLongestWordStartsWith
    @Test
    void testLongestWordStartsWith() {
        // Arrange
        String[] words = {"Hey","Ambidextrous","Apple","Max","Maximum"};

        // Act
        String actual = Practice.longestStartsWith('a',words);

        //Assert
        // longest word starting with "a" = "ambidextrous"
        assertEquals("Ambidextrous", actual);

    }
    // testWordsLongerAndShorterThan
        @Test
    void testWordsLongerAndShorterThan() {
        // Arrange
        String[] words = {"Avenged", "Sevenfold", "Is", "Awesome"};

        // Act
        int actual = Practice.wordsLongerAndShorterThan(words, 4, 8);

        //Assert
        // words longer than 4 characters but shorter than 8 = 2 { Avenged, Awesome }
        assertEquals(2, actual);

    }

    // testDiffBetweenEvenAndOdd
    @Test
    void testDiffBetweenEvenAndOdd() {
        // Arrange
        int[] nums = {1,2,3,4,6,8};

        // Act
        int actual = Practice.differenceBetweenEvenAndOdd(nums);

        // Assert 
        // 4 - 2 = 2
        assertEquals(2, actual);

    }

    // testSecondLargestNum()
    @Test
    void testSecondLargestNum(){ 
        //Arrange
        int[] nums = {123,5748,891,4830};

        //Act
        int actual = Practice.secondLargestNumber(nums);

        //Assert
        //second largest = 4830
        assertEquals(4830, actual);

    }
    
}


