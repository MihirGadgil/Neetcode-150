import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicates {
    public static boolean containsDuplicates(int[] nums) {
        Set<Integer> seen = new HashSet<>();
        for (int num : nums) {
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }
        return false;
    }
    public static void main(String[] args) {
        int[] test1 = {1, 2, 3, 1};
        int[] test2 = {1, 2, 3, 4};
        
        System.out.println("\n Array [1,2,3,1] contains duplicates: " + containsDuplicates(test1));
        System.out.println("Array [1,2,3,4] contains duplicates: " + containsDuplicates(test2));
    }
}