public class classExample
{
    public static void main(String args[])
    {
        long hoursWorked = 40;
        double payRate = 10.0, taxRate = 0.10;
        System.out.println("Hours worked: "+ hoursWorked);
        System.out.println("Pay Amount: "+(hoursWorked * payRate));
        System.out.println("Tax Amount: "+ (hoursWorked*payRate*taxRate));


    }
}
