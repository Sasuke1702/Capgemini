class Person
{
    String first;
    String last;

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
    Person(String first, String last)
    {
        setFirst(first);
        setLast(last);
    }
}
 class Teacher extends Person{
    double salary;
    int start;
    int exp;

    

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getExp() {
        return exp;
    }

    public void setExp(int exp) {
        this.exp = exp;
    }
    Teacher(String first, String last, double salary, int start)
    {
       super (first, last);
       setExp(exp);
       setSalary(salary);
       setStart(start);
    }
    void getData()
    {
        System.out.println("First name "+first);
        System.out.println("Last name "+last);
        System.out.println("Experience "+exp);
        System.out.println("Start to work"+start);
        System.out.println("Salary"+salary);
    }
}
public class Question5
{
    public static void main(String[] args)
    {
        
         Teacher = t1 new Teacher("rushi","gothwal",4000,2);
        t1.getData;
    }
}
