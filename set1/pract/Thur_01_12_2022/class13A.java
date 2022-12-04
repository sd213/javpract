package set1.pract.Thur_01_12_2022;

public class class13A {
    int m1(int a,int b){ //200,100
        System.out.println(a);
        System.out.println(a-b);
        return new class13A().m4(a-1,"Hi");
    }
    String m2(int x){ //500
        System.out.println(x-new class13A().m1(200,199));
        System.out.println(x);
        return "Java";
    }
    String m3(int a, int b, String s){
        System.out.println(a);
        System.out.println(a+a);
        System.out.println(a+b);
        return s;
    }
    int m4(int a, String s){//199,"Hi"
        System.out.println(a);
        System.out.println(s);
        return a+a;
    }
    String m5(String S){
        return S;
    }

    public static void main(String[] args) {
        System.out.println(new class13A().m5(new class13A().m3(15,25,new class13A().m2(500))));
    }
}
