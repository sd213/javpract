package set1.pract.Fri_02_12_2022;

public class class2A {
    void method1(){
        System.out.println("Method1 is called");
    }
    protected void finalize(){
        System.out.println("Garbage has been collected");
    }

    public static void main(String[] args) {
        class2A aobj1=new class2A();
        class2A aobj2=new class2A();
        System.out.println("aobj1 hashcode :" + aobj1.hashCode());
        System.out.println("aobj2 hashcode :" + aobj2.hashCode());
        System.out.println("----------");
        boolean flag1=aobj1.equals(aobj2);
        System.out.println("Result is "+flag1);//false
        boolean flag2=aobj2.equals(aobj1);
        System.out.println("Result is " +flag2);//false
        boolean flag3=aobj2.equals(aobj2);//true
        System.out.println("Result is "+flag3);
        System.out.println(aobj1.equals(new class2A()));
        System.out.println(new class2A().equals(new class2A())); //false
        System.out.println("---------");
        System.out.println("aobj1.toString():" + aobj1.toString());
        System.out.println("aobj2.toString():" + aobj2.toString());
        System.out.println("---------");
        System.out.println("get Class() : " + aobj1.getClass());
        System.out.println("get class() :" + aobj2.getClass());
        aobj1=null; //nullifying the reference
        System.out.println("---------");
        System.gc(); //It is a way to call garbage collector manually.
    }
}
