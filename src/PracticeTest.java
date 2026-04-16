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
    @Test
    void testlongestWordStartsWith() {
        // Arrange
        String[] words = {"Hey","Ambidextrous","Apple","Max","Maximum"};

        // Act
        String actual = Practice.longestStartsWith('a',words);

        //Assert
        // longest word starting with "a" = "ambidextrous"
        assertEquals("a", actual);

    }
    
}


