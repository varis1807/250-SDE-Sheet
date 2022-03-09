import java.util.*;
public class ProductArrayExceptSelf {
      public int[] productExceptSelf(int[] nums) {
            int[] rigth = new int[nums.length];
                  
            int prod = 1;
            for(int i=nums.length-1;i>=0;i--){
                prod *= nums[i];
                rigth[i]= prod;
            }
               int[] ans = new int[nums.length];
               int prod1=1;
        for(int i=0;i<nums.length-1;i++){
                int lp=prod1;
                int rp=rigth[i+1];
                ans[i]=lp*rp;
                prod1*=nums[i];
            }
                ans[nums.length-1] = prod1;
            return ans;
        }
}
