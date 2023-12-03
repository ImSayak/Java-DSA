public class StaticKeyword {
    public static void main(String[] args) {
        Student s1= new Student();
        s1.schloolName="HGSVV";

        Student s2 = new Student();
        System.out.println(s2.schloolName);

        Student s3 = new Student();
        s3.schloolName = "HIT";

        Student s4= new Student();
        System.out.println(s4.schloolName);
    }
}
class Student{
    String name;
    int roll;
    
    static String schloolName;

    void setName(String name){
        this.name = name;
    }
    String getName(){
        return this.name;
    }
}
