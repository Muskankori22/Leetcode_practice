class Solution {
    public int maxArea(int[] height) {
       int s = 0;
       int e = height.length-1;
       int maxarea = 0;
       while(s<e)
       {
        int h = Math.min(height[s],height[e]);
        int w = e-s;
        int maxi = h*w;
        maxarea = Math.max(maxi,maxarea);
        if(height[s]<height[e])
        {
            s++;
        }
        else{
            e--;
        }
       } 
       return maxarea;
    }
}