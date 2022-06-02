// Data Input Stream
import java.io.*;
public class DemoDataOutputStream{
public static void main(String[] args)throws Exception
    {


        FileOutputStream fout;
        fout=new FileOutputStream("C:\\Users\\Rushi\\IdeaProjects\\Capgemini\\22_04_22\\test3.txt");
        DataOutputStream dout;
        dout=new DataOutputStream(fout);
        dout.writeInt(102);
        dout.writeBoolean(true);
        dout.writeDouble(1.2);
        dout.close();
    }


}
