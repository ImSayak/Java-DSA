import java.util.*;

public class ActivitySelection{
    public static void main(String[] args) {
        int n=6;
        int start[]={1 ,3 ,0 ,5, 8, 5};
        int end[]={2, 4, 6, 7, 9, 9};

        ArrayList<Integer>ans=new ArrayList<>();

        //for sort the array
        int activites[][]=new int[n][3];
        for(int i=0;i<n;i++){
            activites[i][0]=i;         //we store index number
            activites[i][1]=start[i];  // we store start
            activites[i][2]=end[i];    //we store end
        }
        
        //lamba for sort the 2d array
        Arrays.sort(activites, Comparator.comparingDouble(o -> o[2]));//we are trying to sort col 2
        //1st we add the 1st job
        int maxAct=1;
        ans.add(activites[0][0]);
        int lastEnd=activites[0][2];
        
        for(int i=1; i<n;i++){
            if(activites[i][1]>=lastEnd){
                maxAct++;
                ans.add(activites[i][0]);
                lastEnd=activites[i][2];
            }
        }
        System.out.println("Max number of job "+maxAct);

        for(int i=0;i<ans.size();i++){
            System.out.print("A"+ans.get(i)+" ");
        }
        System.out.println();
    }
}