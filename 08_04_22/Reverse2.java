import java.util.Scanner;

/*2. Write a program   to read n number of values in an array and display it in reverse order.
Test Data :
Input the number of elements to store in the array :3
Input 3 number of elements in the array :
element - 0 : 2
element - 1 : 5
element - 2 : 7
Expected Output :
The values store into the array are :
2 5 7
The values store into the array in reverse are :
7 5 2
*/
public class Reverse2
{
    public static void main(String[] args)
    {
        int i;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Size of Array: ");
        int tot = scan.nextInt();
        int[] arr = new int[tot];

        System.out.print("Enter " +tot+ " Elements for the Array: ");
        for(i=0; i<tot; i++)
            arr[i] = scan.nextInt();

        System.out.println("\nReverse of Given Array is: ");
        for(i=(tot-1); i>=0; i--)
            System.out.print(arr[i]+ " ");
    }
}
