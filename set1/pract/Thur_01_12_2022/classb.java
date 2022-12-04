package set1.pract.Thur_01_12_2022;

public class classb {
    void m1(int a, int b){
        classb bobj=new classb();
        System.out.println(a-1);
        System.out.println(b);
        bobj.m4(10,2,2);
    }
    void m2(int x){
        classb obj=new classb();
        System.out.println(x);
        obj.m1(10,10);
        System.out.println(x+9);
    }
    void m3(int x, int y){
        System.out.println(x*y);
        classb bobj=new classb();
        System.out.println(y);
        bobj.m2(1);
    }
    void m4(int a , int b ,int c){
        System.out.println(a+b);
        System.out.println(a/c);
        System.out.println(a-b);
        System.out.println(a*b);

    }

    public static void main(String[] args) {
        classb obj= new classb();
        obj.m3(5,2);
    }
}
