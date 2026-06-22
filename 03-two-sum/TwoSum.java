import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> seen = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            Integer item = seen.get(target - nums[i]);
            if (item != null) {
                return new int[] {item, i};
            } else {
                seen.put(nums[i], i);
            }
        }
        return new int[] {-1, -1};
    }
    public static void main(String[] args) {
        Arrays.stream(twoSum(new int[]{3, 4, 2, 5}, 7)).forEach(System.out::println);
        Arrays.stream(twoSum(new int[]{3, 4, 2, 5}, 6)).forEach(System.out::println);
        Arrays.stream(twoSum(new int[]{3, 4, 2, 5}, 76)).forEach(System.out::println);
    } 
}
