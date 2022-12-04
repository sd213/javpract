package set1.pract.Thur_01_12_2022;

public class class11A {
    int m1(int a, int b , char c){
        System.out.println(c);
        int result=new class11A().m2("Java ",100,'y');
        return 10+10+result;
    }
    int m2(String S , int a, char c){
        System.out.println(S);
        System.out.println(c);
        return 20;
    }

    public static void main(String[] args) {
        System.out.println(new class11A().m1(10,20,'X'));
    }
}
