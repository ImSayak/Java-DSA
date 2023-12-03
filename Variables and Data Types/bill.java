// Enter cost of 3 items from the user(using float datatype)-a pencil,a pen and an eraser. You have to output the total cost of the items back to the user as their bill.(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)

import java.util.*;

public class bill {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the cost of a pencil");
        float pencil = sc.nextFloat();

        System.out.println("Enter the cost of a pen");
        float pen = sc.nextFloat();

        System.out.println("Enter the cost of an eraser");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;
        System.out.println("Total cost " + total);

        float gst = (total* 0.18f)+total;
        System.out.println("Total cost with gst " + gst);
    }
}
