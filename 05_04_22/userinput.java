import java.util.Scanner;
public class userinput
{
    public static void main(String arg[])
    {
        Scanner sc= new Scanner(System.in);
        String name;
        int age;
        System.out.println("enter your name and age ");
        name=sc.next();
        age=sc.nextInt();
        System.out.println("hello"+name+"Your age is "+age);

    }

}
