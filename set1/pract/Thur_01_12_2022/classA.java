package set1.pract.Thur_01_12_2022;

public class classA {
    void meth1(){
        System.out.println("method meth1 Called");
    }

    public static void main(String[] args) {
        System.out.println("Start");
        new classA().meth1();//calling with object
        classA aobj = new classA();
        aobj.meth1();//calling with referrence
        System.out.println("End");
    }
}
