package inHeritance;

public class Calculator {

    int add (int i,int j) {
        return i + j;
    }
        int sub(int i,int j) {
            return i - j;
        }


    public static void main(String[] args) {
        Calculator c1=new Calculator();
        System.out.println(c1.add(2,4));
        System.out.println(c1.sub(4,5));



    }
}
