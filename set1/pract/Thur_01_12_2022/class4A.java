package set1.pract.Thur_01_12_2022;

public class class4A {
    int m1(){
        System.out.println("Method : m1 called");
        return 99;
    }
    void m2(){
        System.out.println("Method : m2 called");
    }

    public static void main(String[] args) {
        class4A obj=new class4A();
        int result=obj.m1();
        System.out.println(result);
        obj.m2();
    }
}
