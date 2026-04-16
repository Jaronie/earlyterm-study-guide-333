import java.util.HashSet;
import java.util.Set;

public class Practice {
    /**
     * Returns the difference between the largest and smallest integer in an array.
     * 
     * @param nums a non-empty, non-null array of numbers
     * @return the difference between the largest and smallest number
     */
    public static int maxDiff(int[] nums) {

        int max = nums[0];
        int min = nums[0]; // Creates min and max variables initialized at start of array


        for(int i = 0; i < nums.length; i++){
            if(nums[i] < min){ // If a num is found less than min, it will redefine itself
                min = nums[i];
            }
            else if(nums[i] > max){ // Likewise with greater than values
                max = nums[i];
            }
        }
    

        return max - min;

    }



    // TODO: Implement the other methods from the README AND tests for each one

    // For each method you are only required to implement it for one of the data
    // structures. But use a different data structure for each method. For example,
    // do maxDiff with an array, the next question with a Set, etc.

    public static String longestStartsWith(char c, String[] words){
        String word = "";
        Set<String> seen = new HashSet<>();

        for(String w : words){
            seen.add(w);
        }
        for(String w : seen){
            if(w.startsWith(String.valueOf(c)) && w.length() > word.length()){
                word = w;
            }
        }
        return word;

    }
    }
