package set1.pract.Fri_02_12_2022;


/* Types of Method Calling */
public class class3AA {
    void m1(){
        System.out.println("method m1 called");
    }
    static void m2(){
        System.out.println("method m2 called");
    }

    public static void main(String[] args) {
        new class3AA().m1(); // calling a method by object
//        class3AA.m1(); // C.E ( calling a method by classname )
        new class3AA().m2(); // calling a mehod by object
//        class3AA.m2(); // C.E (Calling a method by class name
    }


}
