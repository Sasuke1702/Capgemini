/*1. Write a program   to store elements in an array and print it.
Test Data :
Input 10 elements in the array :
element - 0 : 1
element - 1 : 1
element - 2 : 2
.......
Expected Output :
Elements in array are: 1 1 2 3 4 5 6 7 8 9*/
import java.util.Scanner;
public class StoreElementArray
{
    public static void main(String[]args) {


        Scanner sc = new Scanner(System.in);

        int i;
        System.out.println("Enter array: ");
        int[] arr = new int[10];
        for (i = 0; i < arr.length; i = i + 1) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < arr.length; i = i + 1) {
            System.out.println("ELement :"+arr[i]);
        }
    }
}
