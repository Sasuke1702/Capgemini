
public class DemoApp
{
    public String getGreeting() {
        return "Hello World!";
    }

    public static void main(String[] args) {

        Student st=new Student();
        st.setId(1);
        st.setName("test");
        StudImpl ob;
        ob=new StudImpl();
        ob.update(st);
        //ob.delete(st);
       // ob.save(st);


    }

}
