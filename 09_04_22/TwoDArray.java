
import java.util.Scanner;
public class TwoDArray
{
    public static void main(String[]args)
    {
        int[][]arr=new int[3][3];           //ini. 2-D Array
       // int[][] arr2={{10,20,30},{40,50,60,},{70,80,90}};
        Scanner sc = new Scanner (System.in);
        int i,j ;
        System.out.println("Enter your Array : ");
        for(i=0;i<3;i=i+1)   // Row INdex
        {
            for(j=0;j<3;j=j+1)
            {
                arr[i][j]=sc.nextInt();     //for output of Array
            }

        }
        System.out.println("Your Array ;");
        for(i=0;i<3;i=i+1)
        {
            for(j=0;j<3;j=j+1)
            {
                System.out.print(" "+arr[i][j]); // for Transprose of matrix System.out.print(" "+arr[j][i]);
            }
            System.out.println();
        }

    }
}

