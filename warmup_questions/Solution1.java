import java.util.HashSet;
import java.util.Set;

public class Solution1 {

    public boolean containsDuplicate(int[] nums) {
        // TODO: Write your code here

        Set<Integer> numSet = new HashSet<>();

        for (int  i = 0; i < nums.length; i++) {
            if (numSet.contains(nums[i])) {
                return true;
            } else {
                numSet.add(nums[i]);
            }
        }

        return false;

    }
}
