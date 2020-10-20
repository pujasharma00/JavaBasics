package ifstatement;

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter a Number");
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        String evenOdd= (num % 2 == 0) ? "even" : "odd";


            System.out.println(num +"is a"+ evenOdd + "num");
        }


    }



