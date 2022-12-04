package set1.pract.Fri_02_12_2022;

public class class2B {
    void display(){
        System.out.println("Hello World");
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Garbage  has been called");
    }

    public static void main(String[] args) {
        class2B bobj1=new class2B();
        class2B bobj2=new class2B();
        bobj1.display();
        bobj1=null;
        //bobj.display(); // It gives a null pointer Exception
        bobj2.display();
        System.gc();
    }
}
