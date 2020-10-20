package ifstatement;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter the Number");
        Scanner obj=new Scanner(System.in);
    int num= obj.nextInt();
    if( num % 2==0) {
        System.out.println("Number is Even");
    }
    else
    {
        System.out.println("Number is odd");

    }

    }
}
