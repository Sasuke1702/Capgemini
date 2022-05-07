import java.util.Scanner;

public class ProfitLoss
{
    public static void main(String args[])
    {

        double cost,selling,total;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter cost price: ");
        cost=sc.nextDouble();
        System.out.println("Enter selling price: ");
        selling=sc.nextDouble();
        total=selling-cost;
        System.out.println(total);

        if (total > 0)
        {
            System.out.println("profit"+total);
        } else {
            System.out.println("Loss"+total);
        }
    }
}
