package ifstatement;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        int a;
        System.out.println("Enter a year");
        Scanner obj=new Scanner(System.in);
        int year=obj.nextInt();
        if(((year % 4 ==0) && (year % 100 !=0)) || (year % 400==0)){
            System.out.println("Leap Year");
        }
            else
            {
                System.out.println("Not leap year");
            }
            }
        }




