import java.util.Scanner;
public class InternetLicatessen
{
    public static void main(String args[])
    {


        Scanner sc = new Scanner(System.in);
        String s1;
        System.out.println("Enter the item ; ");
        s1=sc.nextLine();
        System.out.println("Enter the price ; ");
        double price=sc.nextDouble();
        int charges =0;

        if (price < 10)
        {
            charges =2;
        } else
            {
            charges=0;
        }
        System.out.println("Overnight delivary : (1/0)");
        int x= sc.nextInt();
        if(x==1)
        {
            charges = charges+3;
        }
        else
        {
            charges= charges;
        }
        System.out.println("Invoic : ");
        System.out.println(s1+" "+price);
        System.out.println("Delivery "+ "  "+charges);
        System.out.println("Total"+"  "+(price+charges));
    }

}
