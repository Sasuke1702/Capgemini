//check exception
//unchecked exeception

import java.io.FileInputStream;
import java.io.FileNotFoundException;

 class CheckedUncheckedException
{
    static void fun1()throws FileNotFoundException
    {
        try{
            FileInputStream fin;
            fin=new FileInputStream("\"C:\\Users\\Rushi\\OneDrive\\Desktop\\tcs.txt\"");
        }catch(FileNotFoundException e)
        {
            throw e;
        }
    }
    public static void main(String[]  args)
    {
       // fun1();
    }
}
