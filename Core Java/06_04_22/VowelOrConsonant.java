import java.util.Scanner;
public class VowelOrConsonant {
    public static void main(String args[]) {

        String s1;
        char ch;
        int x;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Alphabet");

        s1= sc.next();
        ch=s1.charAt(0);
        x=ch;
        if ( x=='a'|| x== 'e'||x=='i' || x=='o' || x=='u')
        {
            System.out.println("Vowel");
        }
        else
            {
            System.out.println("Consonant");
        }

    }
}