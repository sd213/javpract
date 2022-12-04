package set1.pract.Thur_01_12_2022;

public class class6A {
    int m1(int a , int b){
        System.out.println(a+b);
        System.out.println(a);
        return b*10;
    }

    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println(new class6A().m1(5,2));
        System.out.println("-----");
        System.out.println(new class6A().m1(5,2)+80);
        System.out.println("end");
    }
}
