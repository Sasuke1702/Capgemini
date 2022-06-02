import java.io.*;

/*
    3. WAP program to copy one image file into another (.jpg or png file) using byte io
*/
public class Assiment3 {
    public static void main(String[] args) throws Exception {
        FileInputStream fin = new FileInputStream("C:\\Users\\Rushi\\IdeaProjects\\Capgemini\\25_04_22\\image.jpg");
        BufferedInputStream bin = new BufferedInputStream(fin);
        FileOutputStream fout = new FileOutputStream("C:\\Users\\Rushi\\IdeaProjects\\Capgemini\\25_04_22\\image2.jpg");
        BufferedOutputStream bout = new BufferedOutputStream(fout);
        int x;
        do{
            x = bin.read();
            if(x!=-1){
                bout.write(x);
            }
        }while (x!=-1);
        bin.close();
        bout.close();

    }
}