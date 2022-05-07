import java.util.Scanner;
public class Percentage
{
    public static void main(String args[]) {

        double phy, che,bio,math,comp, total,per;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks of Physics: ");
        phy = sc.nextDouble();
        System.out.println("Enter marks of Chemistry: ");
        che = sc.nextDouble();
        System.out.println("Enter marks of Biology: ");
        bio = sc.nextDouble();
        System.out.println("Enter marks of Mathematics: ");
        math = sc.nextDouble();
        System.out.println("Enter marks of computer: ");
        comp = sc.nextDouble();
        total = phy+che+bio+math+comp;
        System.out.println("Total marks :"+total);
        per=(total/500)*100;
        System.out.println("Percentage: "+per);

        if (per >= 90)
        {
            System.out.println("Grade A");
        }
        else if (per>=80)
        {
            System.out.println("Grade B");
        }
        else if (per>=70)
        {
            System.out.println("Grade C");
        }
        else if (per>=60)
        {
            System.out.println("Grade D");
        }
        else if (per>=50)
        {
            System.out.println("Grade E");
        }
        else if (per<40)
        {
            System.out.println("Grade F");
        }

        else {
            System.out.println("Fail");
        }
    }
}
