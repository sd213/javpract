package set1.pract.Thur_01_12_2022;

public class class5A {
    int m1(int a, int b){
        System.out.println("Hi");
        return a+b;

    }

    public static void main(String[] args) {
        int x= new class5A().m1(99,1) -1;
        System.out.println("X value : " +x );
        String data=new class5A().m2();
        System.out.println(data);
    }
    String m2(){
        System.out.println("Hello");
        return "Java is awesome";
    }

}
