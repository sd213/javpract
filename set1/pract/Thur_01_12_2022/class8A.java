package set1.pract.Thur_01_12_2022;

public class class8A {
    void m1(){
        System.out.println(10);
        System.out.println(64);
        System.out.println("End");
    }
    int m2(int a,int b, int c){
        System.out.println(a);
        class8A obj = new class8A();
        String s=obj.m5(100,"Java is Awesome");
        System.out.println(s);
        return a-b;

    }
    String m3(String s ,int b, int d){
        System.out.println(b+d);
        return s;
    }
    int m4(int c,int k){ //20,10
        System.out.println(k);
        class8A obj=new class8A();
        int result=obj.m2(50,50,50);
        System.out.println(result);
        return k+10;
    }
    String m5(int a, String L){
        System.out.println(a+a);
        class8A obj=new class8A();
        String s= obj.m3("Hi",13,10);
        System.out.println(s);
        return L;
    }

    public static void main(String[] args) {
        class8A obj=new class8A();
        System.out.println("Start");
        int result=obj.m4(20,10);
        System.out.println(result);
        obj.m1();
    }
}
