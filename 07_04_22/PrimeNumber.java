import java.util.Scanner;
public class PrimeNumber{

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number : ");

        int givenNumber=sc.nextInt();
        int n = 2;
        int divisibleCount = 0;;
        while (n <= givenNumber / 2) {
            if (givenNumber % n == 0) {
                divisibleCount++;
                break;
            }
            n++;
        }
        if (divisibleCount == 0 ) {
            System.out.print(givenNumber + " is a prime number ");
        } else {
            System.out.print(givenNumber + " is not a prime number ");
        }

    }
}
