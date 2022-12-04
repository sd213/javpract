package set1.pract.Fri_02_12_2022;

public class class5AA {
    int m1(){
        System.out.println("method m1 called");
        return 99;

    }
    int m2(){
        System.out.println("method m2 called");
        return 1;
    }
    class5AA(){
        System.out.println(new class5AA("Hello").m1()+1);
        System.out.println("Hi");
    }
    class5AA(String S){
        System.out.println(S);
    }

    public static void main(String[] args) {
        System.out.println(new class5AA().m2()+99);
    }
}
