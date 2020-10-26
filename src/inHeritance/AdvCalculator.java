package inHeritance;

public class AdvCalculator {
    int div(int i, int j) {
        return i / j;
    }
    int multi(int i,int j)
    {
        return i*j;

    }

    public static void main(String[] args) {

        AdvCalculator c2 = new AdvCalculator();
        {
            System.out.println(c2.div(6, 2));
            System.out.println(c2.multi(2, 3));

        }
    }
}
