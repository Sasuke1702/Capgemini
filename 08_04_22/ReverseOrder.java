
/*Exercise 5 — Reverse Order
Examine the following program:
class Exercise5
{
public static void main ( String[] args )
{
int[] val = {0, 1, 2, 3};
int temp;
System.out.println( "Original Array: "
+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
// reverse the order of the numbers in the array
System.out.println( "Reversed Array: "
+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
}
}
Complete the program so that the numbers in the array appear in reversed order. You will need to
use the variable temp to do this.
Note: this is a harder exercise than you might guess. I sometimes put it on a midterm
examination, and some students get the question wrong.*/
public class ReverseOrder
{
    public static void main ( String[] args )
    {
        int[] val = {0, 1, 2, 3};
        int temp;
        System.out.println( "Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
// reverse the order of the numbers in the array
        System.out.print("Reversed Array: ");
        for (int i = val.length-1;i>=0; i--)
        {
            System.out.print( "" + val[i] );
        }

    }

}
