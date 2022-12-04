package set1.pract.Fri_02_12_2022;

public class class3A {
    void method1(){
        System.out.println("method1 called");
        System.out.println(10+30);
        System.out.println("Hi");
    }
    int method2(String S){
        System.out.println("method2 called");
        System.out.println("S value : " +S);
        return 100;
//        System.out.println("Hello"); // C.E because of unreachable code
    }
    int method3(int a,int b){
        System.out.println("Method3 called");
        System.out.println("a value : " + a);
        System.out.println("b value : " + b);
        System.out.println("Addition: " +(a+b));
        System.out.println("int & char both are compatible");
        return 'A';
    }
    int method4(){
        System.out.println("Method4 called");
        int i=5;
        if(i<=10){
            System.out.println("If block executed");
            return 100+5;
        }
        else
        {
            System.out.println("Else block executed");
            return 100-5;
//            System.out.println("Hello"); // C.E Unreachable code
        }

    }
    void method5(){
        System.out.println("Method5 is called ");
        return;
    }
    int method6(){
        System.out.println("Method6 is called");
        return 100;
    }
    void method7(int a){
        System.out.println("Method7 is called");
        System.out.println(" a value : " + a );//100
    }

    public static void main(String[] args) {
        System.out.println("Start");
        class3A obj=new class3A();
        obj.method1();
        System.out.println("------------");
        obj.method2("Java");
        System.out.println("------------");
        System.out.println("Method3 is returning : " + obj.method3(1,'c'));
        System.out.println("------------");
        obj.method4();
        System.out.println("------------");
        obj.method5();
        System.out.println("------------");
        obj.method7(obj.method6());
        System.out.println("End");
    }



}
