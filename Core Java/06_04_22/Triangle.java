import java.util.Scanner;

public class Triangle
{
    public static void main(String args[]) {

        Double  a1,a2,a3,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 angle of Triangle");
        a1=sc.nextDouble();
        a2=sc.nextDouble();
        a3=sc.nextDouble();
        total=a1+a2+a3;

        if (total == 180 )
        {
            System.out.println("it's Triangle");
        } else {
            System.out.println("it's not triangle");
        }
    }
}
