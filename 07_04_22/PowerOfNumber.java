import java.util.Scanner;

public class PowerOfNumber
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        double a=sc.nextInt();
        System.out.println("Enter power number");
        double b=sc.nextInt();
        double sum=Math.pow(a,b);
        System.out.println("power : "+sum);
       /* class Main {
            public static void main(String[] args) {

                int base = 3, exponent = 4;

                long result = 1;

                for (; exponent != 0; --exponent) {
                    result *= base;
                }

                System.out.println("Answer = " + result);
            }
        }*/


    }
}
