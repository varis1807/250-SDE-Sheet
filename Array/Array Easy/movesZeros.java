import java.util.*;
public class movesZeros {
      public void Swap(int[] arr,int i,int j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }
        public void moveZeroes(int[] nums) {
         int n=nums.length;
            int p=-1, itr=0;
            while(itr<n){
                if(nums[itr]>0)
                    Swap(nums,++p,itr);
                itr++;
            }
        }
}
