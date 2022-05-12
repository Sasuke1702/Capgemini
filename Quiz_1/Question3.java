import java.util.Scanner;

public class Question3
{
    public static void main(String[] args)
    {

        Scanner sc =new Scanner(System.in);
        int[] arr=new int[5];
        System.out.println("Enter your Array :");
        for (int i=0;i<5;i++)
        {
            arr[i]= Integer.parseInt(sc.next());
        }
        for (int i =0;i<5;i++)
        {
            System.out.println(arr[i]*arr[i]);
        }
    }
}
