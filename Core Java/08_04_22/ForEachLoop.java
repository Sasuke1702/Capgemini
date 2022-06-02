import java.util.*;
public class ForEachLoop
{
    public static void main(String[]args)
    {
        int i;
        int[]arr={2,3,7,9,1,4,5,8,6};
        for(i=0;i<arr.length;i=i+1)
        {
                System.out.println(arr[i]);
        }
        System.out.println();
        for(int x:arr)// for Each Loop
        {
            System.out.println(x);
        }
    }
}
