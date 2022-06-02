/*Exercise 2 — Two Arrays
Examine the following program:
class Exercise2
{
public static void main ( String[] args )
{
int[] val = {13, -4, 82, 17};
int[] twice;
System.out.println( "Original Array: "
+ val[0] + " " + val[1] + " " + val[2] + " " + val[3] );
// Construct an array object for twice.
// Put values in twice that are twice the
// corresponding values in val.
System.out.println( "New Array: "
+ twice[0] + " " + twice[1] + " " + twice[2] + " " + twice[3] );
}
}
Complete the program so that a new array twice is constructed. Now copy values from val to
twice, but make the values in twice double what they are in val.
*/
import java.util.Scanner;
public class TwoArray
{
    public static void main ( String[] args ) {
        int[] val = {13, -4, 82, 17};
        int[] twice = new int[val.length];
        System.out.println("Original Array: " + val[0] + " " + val[1] + " " + val[2] + " " + val[3]);
        for(int i=0;i<val.length;i++)
        {
            twice[i] =val[i];
            System.out.print(twice[i]*2 +" ");
        }
    }
}
