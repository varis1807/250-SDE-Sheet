public class ContainerWithMostWater{
      public int maxArea(int[] height) {
            int n=height.length;
            int p1=0, p2=n-1;
            int maxArea=-(int)1e9;
            while(p1<p2){
                int len=Math.min(height[p1],height[p2]);
                int width=p2-p1;
                int cArea=len*width;
                maxArea=Math.max(maxArea,cArea);
                if(height[p1]>=height[p2])
                    p2--;
                else
                    p1++;
            }
            return maxArea;
        }
}