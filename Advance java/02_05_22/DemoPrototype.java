import java.util.ArrayList;
class Student implements Cloneable
{
    ArrayList<String>ar;
    Student()
    {
        ar=new ArrayList<>();
    }
    Student(ArrayList<String>t)
    {
        ar=t;
    }
    void loadData()
    {
        ar.add("A");
        ar.add("B");
        ar.add("C");
        ar.add("D");
    }
    void show()
    {
        System.out.println("===================");
        for (String s:ar)
        {
            System.out.println(s);
        }
        System.out.println("===================");
    }
    @Override
    protected Object clone() {
        ArrayList<String>ar2;
        ar2=new ArrayList<>();
        for(String s:ar)
        {
            ar2.add(s);
        }
        Student obj=new Student(ar2);
        return obj;
    }
}
public class DemoPrototype
{
    public static void main(String[] args)
    {
        Student st1=new Student();
        st1.loadData();
        st1.show();
        Student st2=(Student)st1.clone();
        //Student st2=st1;
        st2.show();
        st2.ar.remove("C");
        System.out.println("** st1 object **");
        st1.show();
        System.out.println("** st2 object **");
        st2.show();
    }
}
