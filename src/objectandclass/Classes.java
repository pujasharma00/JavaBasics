package objectandclass;

public class Classes {
    int id;
    String name;
    void insertRecord(int i,String n){
        id=i;
        name=n;
    }
    void displayRecord()
    {
        System.out.println(id+""+name);
    }
    class Test{
        public static void main(String[] args) {
        Classes s1 = new Classes();
        Classes s2=new Classes();
       s1.insertRecord(11,"poo");
       s2.insertRecord(12,"sharma");
       s1.displayRecord();
       s2.displayRecord();

    }
    }}
