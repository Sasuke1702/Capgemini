/*4. Create a class that captures airline tickets. Each ticket lists the departure and arrival cities, a
flight number, and a seat assignment. A seat assignment has both a row and a letter for the seat
within the row (such as 12F). Make two examples of tickets.*/
import java.util. Scanner;
class Ticket {

    Scanner ob = new Scanner(System.in);
    String dep, arr, flightNo, seat;

    void data() {
        System.out.println("Enter Departure name : ");
        dep = ob.next();
        System.out.println("Enter Arrival Cities :");
        arr = ob.next();
        System.out.println("Enter Flight Name : ");
        flightNo = ob.next();
        System.out.println("Enter Seat No : ");
        seat = ob.next();

    }

    void show() {
        System.out.println("Departure Name : " + dep);
        System.out.println("Arrival Cities : " + arr);
        System.out.println("Flight Name :" + flightNo);
        System.out.println("Seat No :" + seat);
    }
}

public class AirlineTickets
{
    public static void main(String[] args)
    {
        Ticket p1 = new Ticket();
        Ticket p2 = new Ticket();
        p1.data();
        p2.data();
        p1.show();
        p2.show();
    }
}


