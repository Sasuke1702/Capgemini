import java.util.*;
public class Question2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first name ");
        String first=sc.next();
        System.out.println("Enter middle name ");
        String middle=sc.next();
        System.out.println("Enter last name ");
        String last=sc.next();

        System.out.println(first.toUpperCase(Locale.ROOT)+middle.toUpperCase(Locale.ROOT)+last.toUpperCase(Locale.ROOT));

    }
}
