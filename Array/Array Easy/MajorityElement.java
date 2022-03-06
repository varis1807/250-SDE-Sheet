import java.util.*;
public class MajorityElement{
      //O(n^2)================================================
        // Function to find Majority element
    // in an array
    static void findMajority(int arr[], int n)
    {
        int maxCount = 0;
        int index = -1; // sentinels
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[i] == arr[j])
                    count++;
            }
 
            // update maxCount if count of
            // current element is greater
            if (count > maxCount) {
                maxCount = count;
                index = i;
            }
        }
 
        // if maxCount is greater than n/2
        // return the corresponding element
        if (maxCount > n / 2)
            System.out.println(arr[index]);
 
        else
            System.out.println("No Majority Element");
    }
 // Sorting
public int majorityElement1(int[] nums) {
      Arrays.sort(nums);
      return nums[nums.length/2];
  }
  
  // Hashtable 
  public int majorityElement2(int[] nums) {
      Map<Integer, Integer> myMap = new HashMap<Integer, Integer>();
      //Hashtable<Integer, Integer> myMap = new Hashtable<Integer, Integer>();
      int ret=0;
      for (int num: nums) {
          if (!myMap.containsKey(num))
              myMap.put(num, 1);
          else
              myMap.put(num, myMap.get(num)+1);
          if (myMap.get(num)>nums.length/2) {
              ret = num;
              break;
          }
      }
      return ret;
  }
  
  // Moore voting algorithm
  public int majorityElement3(int[] nums) {
      int count=0, ret = 0;
      for (int num: nums) {
          if (count==0)
              ret = num;
          if (num!=ret)
              count--;
          else
              count++;
      }
      return ret;
  }
  
  // Bit manipulation 
  public int majorityElement(int[] nums) {
      int[] bit = new int[32];
      for (int num: nums)
          for (int i=0; i<32; i++) 
              if ((num>>(31-i) & 1) == 1)
                  bit[i]++;
      int ret=0;
      for (int i=0; i<32; i++) {
          bit[i]=bit[i]>nums.length/2?1:0;
          ret += bit[i]*(1<<(31-i));
      }
      return ret;
  }
}