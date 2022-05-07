import java.util.Scanner;
public class rainfall
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double April,May,June,avg;
        April=12;
        May=14;
        June=8;
        avg=(April+May+June)/3;
        System.out.println("Average rainfall "+avg);

    }
}
