/*
 what is overrading
 class A {
 void show(){
 System.out.println("In A);
 }
 }
 class B extends A {
 void show(){
 System.out.println("In B);
 }
 }
 public class DemoOverriding {
    public static void main(String[]args){
    B ob=new B();
    ob.show;
    }
    }/
 */
// why we use Overrading
class P extends Object
{
    @Override
    public String toString()
    {
        return "this is object of A/P class";
    }
}
class Q extends P
{
    @Override
    public String toString()
    {
        return "this is object of Q/B class";
    }
}
public class DemoOverriding {
    public static void main(String[]args)
    {
        P ob1=new P();
        Q ob2=new Q();
        System.out.println(ob1);
        System.out.println(ob2);
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
    }
}
