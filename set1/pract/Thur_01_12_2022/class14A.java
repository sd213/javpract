package set1.pract.Thur_01_12_2022;


public class class14A {
    public String testMethod(){
        System.out.println(35);
        return new class14A().testMethod3(new class14A().testMethod2())+ new class14A().testMethod4("where");
    }
    public int testMethod2(){
        System.out.println(25);
        return 25+5;
    }
    public String testMethod3(int a){
        System.out.println(15);
        return "is";
    }
    public String testMethod4(String S){
        System.out.println(45);
        return "Awesome";
    }

    public static void main(String[] args) {
        class14A t = new class14A();
        System.out.println("Java"+t.testMethod());
    }
}
