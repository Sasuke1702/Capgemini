//FileReader
import java.io.*;
public class DemoFileReader
{
    public static void main(String[] args)throws Exception
    {
        FileReader fin;
        fin=new FileReader("C:\\Users\\Rushi\\IdeaProjects\\Capgemini\\25_04_22\\test1.txt");
        BufferedReader bin;
        bin=new BufferedReader(fin);
        String s1="";
        while ((s1= bin.readLine())!=null)
        {
            System.out.println(s1);
        }
        bin.close();
    }
}
