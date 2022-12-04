package set1.pract.Thur_01_12_2022;

public class class9A {
    int m1(char c){
        System.out.println(" Method m1 called");
        System.out.println("C value : " +c);
        return new class9A().m2("Java") -1 ;
    }
    int m2(String S){
        System.out.println("Method m2 Called");
        System.out.println("S value :" + S);
        return 100;
    }

    public static void main(String[] args) {
        int result = new class9A().m1('J');
        System.out.println(result-99);
    }
}
