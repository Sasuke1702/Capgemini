import java.util.Scanner;

public class DivisibleBy5
{
    public static void main(String args[]) {

        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        n = sc.nextInt();
        if (n % 5 == 0) {
            System.out.println("Number is Divisible by 5");
        } else {
            System.out.println("Number is not divisible by 5");
        }
    }
}
