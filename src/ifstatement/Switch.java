package ifstatement;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        int d;
        System.out.println("Enter a day");
        Scanner obj = new Scanner(System.in);
        int day=obj.nextInt();
        switch(day){
            case 1:
                System.out.println("Sunday");
            break;
            case 2:
                System.out.println("Monday");

            break;
            case 3:
                System.out.println("Tuesday");
            break;
            default:
                System.out.println("Invalid");

        }
    }
}
