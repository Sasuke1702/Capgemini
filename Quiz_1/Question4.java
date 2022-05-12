import java.util.*;


class CaptureStudent
{
   private String first;
   private String last;
   private int year;

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }


    private String major;
    void getdata()
    {
        System.out.println("First name "+getFirst());
        System.out.println("Last name "+getLast());
        System.out.println("Class Year "+getYear());
        System.out.println("Major "+getMajor());
    }
}

public class Question4
{
    public static void main(String[] args)
    {
        CaptureStudent s1 =new CaptureStudent();
        s1.setFirst("Rushi");
        s1.setLast("Gothwal");
        s1.setYear(4);
        s1.setMajor("ENTC");


        s1.getdata();
        CaptureStudent s2 =new CaptureStudent();
        s2.setFirst("Pranav");
        s2.setLast("Kulkarni");
        s2.setYear(4);
        s2.setMajor("ENTC");
        s2.getdata();
    }


}
