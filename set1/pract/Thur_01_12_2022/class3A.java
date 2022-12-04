package set1.pract.Thur_01_12_2022;

public class class3A {
    void m1(int x ,int y){
        System.out.println(x+y);
        System.out.println(x);

    }
    void m2( String s1){
        new class3A().m1(22,1);
        System.out.println(s1);
    }
    void m3 (int a, int b, int c){
        new class3A().m2("Awesome");
        System.out.println(a+b+c);

    }

    public static void main(String[] args) {
        System.out.println("start");
        new class3A().m3(5,3,2);
    }
}
