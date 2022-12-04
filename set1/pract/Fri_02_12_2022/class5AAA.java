package set1.pract.Fri_02_12_2022;

public class class5AAA {
    public class5AAA(){
        System.out.println("Sunday");
        class5AAA obj=new class5AAA(10);
        System.out.println("Tuesday");
        String S=obj.display("Challenge Accepted");
        System.out.println(S);
    }
    public class5AAA(int temp){ //10
        System.out.println("Saturday");
        class5AAA obj=new class5AAA(10,20);
        int a=obj.m1() + temp; //110
        System.out.println("--->" + ( a +( obj.m2() ) ) );
        System.out.println("Monday");
    }
    String display(String S){
        System.out.println("In the next Statement Returning String");
        return S;
    }
    int m1(){
        return 100;
    }
    int m2(){
        return 99;
    }
    public class5AAA(int data , int temp){ //10,20
        System.out.println("Thursday");
        System.out.println("----> " + ( data + new class5AAA("Hi").m2()-temp));
    }
    class5AAA(String s){
        System.out.println(s);
    }

    public static void main(String[] args) {
        class5AAA obj=new class5AAA();
        System.out.println("Output verified");
    }
}
