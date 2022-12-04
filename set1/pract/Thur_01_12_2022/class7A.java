package set1.pract.Thur_01_12_2022;

public class class7A {
    int m1(int a){
        System.out.println(a+a);
        return a+10;

    }
    int m2(int a,int b){
        System.out.println(a);
        return a+b+10;
    }
    int m3(int a,int b ,int c){
        System.out.println(c);
        return a+b+c+10;

    }

    public static void main(String[] args) {
        class7A obj= new class7A();
        int x=obj.m1(5);
        System.out.println(x+10);
        System.out.println(obj.m2(8,2));
        int y=obj.m3(2,3,4);
        System.out.println(x+y);
    }
}
