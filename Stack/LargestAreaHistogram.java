import java.util.*;

public class LargestAreaHistogram {

    public static int largestRectangleArea(int[] heights) {
        if(heights.length == 0){
            return heights[0];
        }
        int maxArea=0;
        int nsr[]=new int[heights.length];
        int nsl[]=new int[heights.length];

        //Next Smaller Right --O(n)
        Stack<Integer>s=new Stack<>();
        for(int i=heights.length-1; i>0;i--){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsr[i]=heights.length;
            }else{
                nsr[i]=s.peek();
            }
            s.push(i);
        }
        //Next Smaller Left --O(n)
        s=new Stack<>();
        for(int i=0; i<heights.length;i++){
            while(!s.isEmpty() && heights[s.peek()] >= heights[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nsl[i]=-1;
            }else{
                nsl[i]=s.peek();
            }
            s.push(i);
        }
        //Current Area
        //width = i-j-1 = nsr[i]-nsl[i]-1
        for(int i=0;i<heights.length;i++){
            if(heights[i]==0){
                continue;//skip the bar with 0 height
            }
            int height = heights[i];
            int width = nsr[i]-nsl[i]-1;
            int area = height*width;
            maxArea = Math.max(area,maxArea);
        }
        return maxArea;
    }
    public static void main(String[] args) {
        int heights[]={2,1,5,6,2,3};
        System.out.println(largestRectangleArea(heights));
    }
}

