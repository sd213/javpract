package set1.pract.Fri_02_12_2022;

public class class5A {
    public class5A(){
        System.out.println("Non parameterized Constructor");
    }
    public class5A(int a){
        System.out.println("Parameter Constructor");
        System.out.println(" A value : " + a );
        new class5A();
    }
    void m1(){
        System.out.println("Method m1 called");
    }

    public static void main(String[] args) {
        class5A obj=new class5A(100);
        obj.m1();
    }
}
