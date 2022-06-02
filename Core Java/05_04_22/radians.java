import java.util.Scanner;
public class radians

{
    public static void main(String args[])

    {
    Scanner sc = new Scanner(System.in);
    double rad, degrees;
    System.out.println("Enter value of degree = ");
    degrees = sc.nextDouble();
    rad = degrees * Math.PI/180;
    System.out.println("Radians = "+ rad);

    }


}
