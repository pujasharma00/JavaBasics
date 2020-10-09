import java.util.Scanner;

public class fever {
    public static void main(String[] args) {
        Scanner number=new Scanner(System.in);
        System.out.println("enter a body temperature");
        int num= number.nextInt();
        if(num>=100){
            System.out.println("you have a Fever");}
        else
        {
            System.out.println("you dont have fever");

        }


    }
}
