import java.util.*;
public class findPivotIdx {
      public int pivotIndex(int[] nums) {
            int oSum=0;
            for(int i=0; i<nums.length; i++)
                oSum+=nums[i];
            
            int lSum=0;
            int rSum=oSum;
            for(int j=0; j<nums.length; j++){
               
                rSum-=nums[j];
                if(lSum==rSum)
                    return j;
                 lSum+=nums[j];
            }
            return -1;
        }
}
