/*2. Create a class that captures planets. Each planet has a name, a distance from the sun, and its
gravity relative to Earth’s gravity. For distance and gravity, use the type double which captures
real numbers. Make objects for Earth and your favorite non-earth planet.*/
import java.util. Scanner;
class Planets
{

    Scanner ob = new Scanner (System.in) ;
    String planet;
    double dis,gra;
    int cls;
    void data()

    {
        System.out.println("Enter Planet name : ");
        planet = ob.next();
        System.out.println("Enter distance from sun :");
        dis = ob.nextDouble();
        System.out.println("Enter Gravity relative to earth : ");
        gra = ob.nextDouble();

    }
    void show() {
        System.out.println("planet : " + planet );
        System.out.println("Enter distance from sun : " + dis);
        System.out.println("Enter Gravity relative to earth :" + gra);
    }
}
public class CapturePlanets
{
    public static void main(String[] args) {
        Planets p1 = new Planets();
        Planets p2 = new Planets();
        p1.data();
        p2.data();
        p1.show();
        p2.show();
    }

}
