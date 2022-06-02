import java.util.Scanner;
public class SteamEngineEfficiency
{
    public static void main(String args[])
    {
        double eff,tair,tsteam;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Air Temperature in Kelvin : ");
        tair=sc.nextDouble();
        System.out.println("Enter The Steam Temperature : ");
        tsteam=sc.nextDouble();
        if(tsteam>=373 && tair!=tsteam)
        {
            eff=1-(tair/tsteam);
            System.out.println("max efficiency is : "+eff);
        }
        else
        {
            System.out.println("maz efficiency is : 0");
        }


    }

}
