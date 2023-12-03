import java.util.Comparator;
import java.util.PriorityQueue;

public class PQbasic {
    static class Student implements Comparable<Student>{
        String name;
        int rank;

        public Student(String name, int rank){
            this.name = name;
            this.rank = rank;
        }
        @Override
        public int compareTo(Student s2){
            return this.rank - s2.rank;
        }
    }
    public static void main(String[] args) {
    //    PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());
    //    pq.add(1);// O(log n)
    //    pq.add(3);
    //    pq.add(2);
    //    pq.add(5);
    //    pq.add(4);

       PriorityQueue<Student> pq = new PriorityQueue<>();
        pq.add(new Student("A", 20));// O(log n)
        pq.add(new Student("B", 12));
        pq.add(new Student("C", 26));
        pq.add(new Student("D", 2));


       while(!pq.isEmpty()){  //O(1)
        System.out.println(pq.peek().name+"->"+ pq.remove().rank ); //O(log n)
        // pq.remove();
       }
    }
}