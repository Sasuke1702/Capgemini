import java.util.Scanner;
public class IfElse
{
    public static void main(String args[])
    {
        String name;
        int age;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter name and age");
        name=sc.next();
        age=sc.nextInt();
        if(age>=18)
        {
            System.out.println("You can cast vote");
        }
        else
        {
            System.out.println("Yuo can not Cast a vote");
        }
    }

}
