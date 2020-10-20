package ifstatement;

import java.util.Scanner;

public class CheckAge {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter the age ");
        Scanner obj = new Scanner(System.in);
        int age=obj.nextInt();
                if(age>18) {
                    System.out.println("Age is above 18");
                }
                else
                {
                    System.out.println("Age is below 18");

                }


    }
}
