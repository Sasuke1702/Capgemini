/* 1. WAP to copy the content of one file to another
	by using CHAR IO classes.
	*/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
public class Assiment1
{
    public static void main(String[] args)throws Exception
    {
        FileReader fin = new FileReader ( "C:\\Users\\Rushi\\IdeaProjects\\Capgemini\\25_04_22\\test1.txt");
        BufferedReader bin = new BufferedReader(fin);
        FileWriter fout = new FileWriter(  "C:\\Users\\Rushi\\IdeaProjects\\Capgemini\\25_04_22\\test2.txt");
        BufferedWriter bout = new BufferedWriter(fout);
        int x;
        do{
                x = bin.read();
        if (x!=-1) {
            bout.write(x);
        }
        }while (x!=-1);
        bin.close();
        bout.close ();
        System.out.println("File Copied");
    }
}
