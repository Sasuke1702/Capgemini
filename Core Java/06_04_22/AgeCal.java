import java.util.Scanner;
public class AgeCal
{
    public static void main(String args[])
    {
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Year of Birth : ");
        int b = sc.nextInt();
        System.out.println("Current Year : ");
        int c = sc.nextInt();
        if(c<b)
        {
            age=(c+100)-b;
            if(age>=100)
            {
                age=100-age;

            }
            System.out.println("Current Year : "+age);
        }
        else if(c>b)
        {
            age=c-b;
            if(age>=100)
            {
                age=100-age;
            }
            System.out.println("Current Year : "+age);

        }
    }
}
