package test;

//public class test.j {
//    public static void main(String[] args) {
//        String s = null;
//        String s1 = null;
//        System.out.println(Objects.equals(s,s1));
//    }
//}
class A {
    static{
        System.out.println("1");
    }
    public A(){
        System.out.println("2");
    }
}
class B extends A{
    static{
        System.out.println("a");
    }
    public B(){
        System.out.println("b");
    }
}
public class j{
    public static void main(String []args) {
        A a = new B();
        a = new B();
    }
}