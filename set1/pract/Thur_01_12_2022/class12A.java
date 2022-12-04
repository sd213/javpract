package set1.pract.Thur_01_12_2022;

public class class12A {
    String m1(int a, int b){
        System.out.println(10);
        System.out.println((54+a)-b);
        int value = new class12A().m5();
        System.out.println(value);
        return "Java";
    }
    int m2(int a){
        System.out.println(15);
        int b=5;
        System.out.println(b-a);
        return ((5*5)-b);
    }
    void m3(){
        System.out.println("Start");
        System.out.println(new class12A().m4());
        System.out.println(40);
    }
    String m4(){
        System.out.println("Today is tuesday");
        return new class12A().m1(4,8);
    }
    int m5(){
        class12A obj = new class12A();
        System.out.println("99");
        return obj.m2(5);
    }

    public static void main(String[] args) {
        class12A obj=new class12A();
        obj.m3();
    }
}
