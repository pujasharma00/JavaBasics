import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in
        );
        System.out.println("enter a number");
        int num = number.nextInt();

        if (num % 2 == 0) {
            System.out.println("it is even");
        } else {
            System.out.println("its odd");
        }
    }
}





