package set1.pract.Thur_01_12_2022;

public class class10A {
    int m1(int a){
        System.out.println(a);
        class10A obj=new class10A();
        return obj.m2()+obj.m3()+a;
    }
    int m2(){
        System.out.println("Hi");
        return 2+new class10A().m3();

    }
    int m3(){
        System.out.println("Hello");
        return 5;
    }

    public static void main(String[] args) {
        System.out.println(new class10A().m1(5)+5);

    }
}
