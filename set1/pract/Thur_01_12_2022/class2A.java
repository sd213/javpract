package set1.pract.Thur_01_12_2022;

public class class2A {
    void meth1(){
        System.out.println("Hi");
    }

    public static void main(String[] args) {
        class2A aobj= new class2A();
        aobj.meth1();
        aobj.meth2(500,"Awesome");
    }
    void meth2(int x , String s){
        System.out.println("Hello");
        System.out.println(s);
        System.out.println(x*2);
    }
}
