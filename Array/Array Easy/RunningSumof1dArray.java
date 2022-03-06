import java.util.*;
public class RunningSumof1dArray {
      public int[] runningSum(int[] nums) {
            int ans=0;
                 int[] temp=new int[nums.length];
                 for(int i=0; i<nums.length; i++){
                   ans=ans+nums[i];
                     temp[i]=ans;
                 }
                 return temp;
             }
}
