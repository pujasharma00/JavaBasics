package ifstatement;

import java.util.Scanner;

public class NestedIf {
    public static void main(String[] args) {
        int a;
        int w;
        System.out.println("Enter age and weight");
        Scanner obj=new Scanner(System.in);
        int age =obj.nextInt();
        int weight= obj.nextInt();
        if (age > 18) {
            if (weight > 50) {
                System.out.println("Eligible");
            }
            else
            {
                System.out.println("Not Eligible");

            }
        }
    }
}
