import java.util.*;

public class ThreeSum {
      public static List<List<Integer>> threeSum(int[] nums) {
            Set<List<Integer>> list = new HashSet<>();
            Arrays.sort(nums);
            for (int i = 0; i < nums.length - 2; i++) {
                  int j = i + 1;
                  int k = nums.length - 1;
                  while (j < k) {
                        int cSum = nums[i] + nums[j] + nums[k];
                        if (cSum == 0)
                              list.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                        else if (cSum > 0)
                              k--;
                        else if (cSum < 0)
                              j++;
                  }
            }
            return new ArrayList<>(list);
      }
}