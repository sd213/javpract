package set1.pract.Fri_02_12_2022;

public class class1A {
    public void m1(){
        System.out.println("m1()");
    }

    public static void main(String[] args) {
        class1A obj1=new class1A();
        class1A obj2=new class1A();
        int x=obj1.hashCode();
        int y=obj2.hashCode();
        System.out.println(x);
        System.out.println("------------");
        System.out.println(y);
    }
}
