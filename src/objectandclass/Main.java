package objectandclass;

public class Main {
    int id;
    String name;
}
class Teststudent1{
    public static void main(String[] args) {
        Student obj=new Student();
        obj.id=101;
        obj.name="Pooja";
        System.out.println(obj.id+""+ obj.name);
    }
}