import java.util.*;
public class JobSequence {

    static class Job{
        int id;
        int deadLine;
        int profit;
        public Job(int i, int d, int p){
            id=i;
            profit=p;
            deadLine=d;         
        }
    }
    public static void main(String[] args) {
        int jobsInfo[][]={{4, 20},{1,10},{1,40},{1,30}};

        ArrayList<Job> jobs = new ArrayList<>();
        for(int i=0; i<jobsInfo.length;i++){
            jobs.add(new Job(i, jobsInfo[i][0], jobsInfo[i][1]));
        }

        Collections.sort(jobs,(obj1, obj2) -> obj2.profit-obj1.profit);//descending order sort

        ArrayList<Integer>seq=new ArrayList<>();
        int time=0;

        for(int i=0;i<jobs.size();i++){
            Job curr = jobs.get(i);
            if(curr.deadLine>time){
                seq.add(curr.id);
                time++;
            }
        }

        //print
        System.out.println("Max job "+seq.size());
        //print seq
        for(int i=0; i<seq.size();i++){
            System.out.print(seq.get(i)+" ");
        }
        System.out.println();
    }
}
