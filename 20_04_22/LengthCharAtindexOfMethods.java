// length, charAt, indexOfMethods
public class LengthCharAtindexOfMethods {
    public static void main(String[] args) {

        String s1 = "Helol World";
        System.out.println(s1.length());
        System.out.println(s1.charAt(7));
        int x;
        x = s1.indexOf("l");
        System.out.println(x);
        x = s1.indexOf("l", x + 1);
        System.out.println(x);

        //   x=s1.lastIndexOf("l");
        //   System.out.println(x);
        // x=s1.indexOf("abc");
        // System.out.println(x);


    }
}
