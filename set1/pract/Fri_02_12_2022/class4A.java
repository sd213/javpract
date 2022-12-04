package set1.pract.Fri_02_12_2022;

public class class4A {
    int i;
    byte b;
    short s;
    long l;
    float f;
    double d;
    char c;
    boolean flag;
    void method1(){
        System.out.println("int default value :" + i );
        System.out.println("int default value :" + b );
        System.out.println("short default value :" + s );
        System.out.println("long default value :" + l );
        System.out.println("float default value :" + f );
        System.out.println("double default value :" + d );
        System.out.println("char default value :" + c );
        System.out.println("boolean default value :" +b );
    }
    void method2(){
        System.out.println("Method2 called");
        int i1=10;
        int i2=20;
        int i3=i1+i2;
        System.out.println("i3 value :" + i3);
        byte b1=10;
        byte b2=10;
        byte b3=(byte) (b1+b2); //10 + 10 = 20 (int) and performing explicit typecasting
        System.out.println("b3 value: " + b3 );
        System.out.println("--------");
        float f=10.9f;
        float f1=11.9f;
        System.out.println("Float value :" + f);
        long x= 2137483648l;
        System.out.println(x);
        /* Every integer number in java is by default considered as int by the compiler
            Every decimal value is by default considered as double by the compiler .
         */
    }

    public static void main(String[] args) {
        class4A obj= new class4A();
        obj.method1();
        obj.method2();
    }
}
