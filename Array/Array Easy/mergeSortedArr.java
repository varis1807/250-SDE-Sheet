import java.util.*;
public class mergeSortedArr {
      public static void merge(int[] a1, int m, int[] a2, int n) {
            int i=m-1, j=n-1;
            int k=n+m-1;
            while(i>=0 && j>=0){
                if(a1[i]>a2[j])
                    a1[k--]=a1[i--];
                
                 else
                a1[k--]=a2[j--];
               
            }
             
                while(j>=0)
                    a1[k--]=a2[j--];
        }
}
