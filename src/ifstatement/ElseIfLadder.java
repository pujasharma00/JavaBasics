package ifstatement;

import java.util.Scanner;

public class ElseIfLadder {
    public static void main(String[] args) {
        int i;
        System.out.println("Enter a marks");
        Scanner obj = new Scanner(System.in);
        int marks=obj.nextInt();
        if (marks < 50) {
            System.out.println("Fail");
        } else if (marks >= 50 && marks < 60) {

                System.out.println("D grade");
            }
            else if (marks >= 60 && marks < 70)
                {
                    System.out.println("C grade");
                }
                else if (marks >= 90 && marks < 100) {

                        System.out.println("A grade");
                    }
                    else {
                        System.out.println("Invalid");

                    }
                }
            }





