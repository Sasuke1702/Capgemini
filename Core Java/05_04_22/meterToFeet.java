import java.util.Scanner;

public class meterToFeet
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        double m,f,i;
        System.out.println("Enter meter");
        m=sc.nextDouble();
        f=m*3.28084;
        System.out.println("Feet = "+f);
        i=m*39.37;
        System.out.println("Inches = "+i);
    }
}
