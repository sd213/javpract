package set1.pract.Fri_02_12_2022;

public class class3a {
    int a=10;
    static int b=20;
    int x;
    private String S;
    static int y;
    //static String a ="Java";
    // int a=100;   // C.E because of duplicate identifiers.
    void m1(){
        System.out.println("Method m1 called");
        int c=30; //Local Variable
        System.out.println("Instance var a"+a);
        System.out.println("Instance var a " + new class3a().a);
        System.out.println("Static var b " + b);
        System.out.println("static var b " + new class3a().b);
        System.out.println("static var b " + new class3a().b);
        System.out.println("Local var c:" + c);
    }
    void m2(){
        System.out.println("m2 called");
        System.out.println("Instance var : a" + a );
        System.out.println("Static var : b " + b);
//        System.out.println("Local var : c " + c );
    }
    void m3(){
        System.out.println("Method m3 called");
        int a=100;
        int b=200;
        System.out.println("Instance var a " + new class3a().a);
        System.out.println("Static var b " + class3a.b);
        System.out.println("Local var a: " + a + "  b : " + b);
    }
    void m4(){
        System.out.println("method4 called");
        int z;
        System.out.println("Instance var x : " + x);
        System.out.println("Static var y : " + y);
//        System.out.println("Local var z : " + z ); //C.E
    }

    public static void main(String[] args) {
        class3a obj=new class3a();
        obj.m1();
        System.out.println("----------");
        obj.m2();
        System.out.println("----------");
        obj.m3();
        System.out.println("----------");
        obj.m4();
    }
}
