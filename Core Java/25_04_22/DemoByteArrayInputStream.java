// ByteArrayInputStream
import java.io.*;

public class DemoByteArrayInputStream
{
    public static void main(String[] args)
    {
        String msg="देवगिरी";
        byte[] arr=msg.getBytes();
        ByteArrayInputStream ob;
        ob=new ByteArrayInputStream(arr);
        int x;
        do{
            x=ob.read();
            System.out.print((char)x);

        }while(x!=-1);
        System.out.println();
    }
}
