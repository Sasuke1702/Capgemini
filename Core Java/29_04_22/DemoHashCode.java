import java.util.HashSet;
//Hash code
class Student
{
    int id;
    String name;
    Student(int a, String b)
    {
        id =a;
        name =b;
    }
    @Override
    public String toString()
    {
        return "("+id+","+ name+")";
    }
    @Override
    public int hashCode()
    {
        int code;
        //code = name.hashCode()+id;
        code =(id%2)+(name.hashCode()/2);
        //code =(id*2)+(name.hashCode());
       // code =(id*2)+(name.hashCode()/2);
        return code;
    }
    @Override
    public boolean equals(Object obj)
    {
        boolean f=false;
        Student st=(Student)obj;
        if(id==st.id && name.equals(st.name))
        {
            f=true;
        }
        return f;
    }
}
public class DemoHashCode
{
    public static void main(String[] args)
    {
        HashSet<Student>hs;
        hs=new HashSet<>();
        Student st1=new Student(1,"A");
        Student st2=new Student(1,"A");
        hs.add(st1);
        hs.add(st2);
        System.out.println(hs);
        System.out.println(st1.hashCode());
        System.out.println(st2.hashCode());
    }
}
