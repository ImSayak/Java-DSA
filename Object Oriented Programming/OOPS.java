public class OOPS {
    public static void main(String[] args) {
        Pen p1=new Pen();//created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color="White";
        System.out.println(p1.color);

        BankAccount myAc= new BankAccount();
        myAc.userName="Sayak";
        myAc.setPswrd("tgutdut");
        System.out.println(myAc.userName);
    }
}

class BankAccount{
    public String userName;
    private String password;

    void setPswrd(String pwd){
        password=pwd;
    }
}


class Pen{
    String color;
    int tip;

    void setColor(String newColor){
        color=newColor;
    }
    void setTip(int newTip){
        tip= newTip;
    }
}