/*Exercise 5 — Town Dump
The New Britain, Connecticut town dump charges you $20 to dispose of 200 pounds of trash.
They charge $8 for each additional hundred pounds beyond the first 200. Write a program that
asks for the weight of a load of trash and then calculates the charge.*/
import java.util.Scanner;
public class TownDump
{
    public static void main (String []args)
    {
        Scanner sc=new Scanner(System.in);
        double weight,Charge=0;
        int i,j;
        System.out.println("Enter the weight of a load trash in pound : ");
        weight=sc.nextDouble();
        if(weight==0 && weight<=200)
        {
           Charge=20;
            System.out.println("Charges :"+Charge);
        }


        else if (weight>200 && weight<=400)
        {
            if(weight-200<=100)
            {
                Charge=28;
                System.out.println("Charges :"+Charge);
            }
            else
            {
                Charge=36;
                System.out.println("Charges :"+Charge);
            }

        }
        else
        {
            System.out.println("Capacity Full");
        }
    }

}
