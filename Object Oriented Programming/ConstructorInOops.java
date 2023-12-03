public class ConstructorInOops {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2=new Student("Sayak");
        Student s3=new Student(66);
    }
}
class Student{
    String name;
    int roll;

    Student(){
        System.out.println("Contructor is called...");
    }
    Student(String name){
        this.name=name;
    }
    Student(int roll){
        this.roll=roll;
    }
}
