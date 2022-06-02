class Address
{
    int housenum;
    String areaname;
    String city;
    //getter and setter for variable

    public int getHousenum() {
        return housenum;
    }

    public void setHousenum(int housenum) {
        this.housenum = housenum;
    }

    public String getAreaname() {
        return areaname;
    }

    public void setAreaname(String areaname) {
        this.areaname = areaname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
class Student
{
    int id;
    String name;
    Address adr;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAdr() {
        return adr;
    }

    public void setAdr(Address adr) {
        this.adr = adr;
    }
}
public class PerimitiveNonPerimitive
{
    public static void main(String[]args)
    {
        Address ad=new Address();
        ad.setHousenum(1);
        ad.setAreaname("abc");
        ad.setCity("Aurangabad");
        // create student class object
        Student st=new Student();
        int x=101;
        st.setId(x);  // passing perimitive value
        st.setAdr(ad);  // passing non perimitive value
        st.setName("xyz");
        // read value
        int id1;
        id1= st.getId();
        String n;
        n= st.getName();
        Address ad1;
        ad1= st.adr;
        // read address object values
        int hn;
        hn= ad1.getHousenum();
        String area;
        area= ad1.getAreaname();
        String city=ad1.getCity();
        System.out.println("Name :"+n);
        System.out.println("id : "+id1);
        System.out.println("Address : "+hn+" "+area+" "+city);
    }
}
