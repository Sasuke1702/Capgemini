//remove and
//sublist
import java.util.*;
public class DemoRemoveAndSublist
{
    public static void main(String[] args) {
        ArrayList<String> ar= new ArrayList<>();

        ar.add("X");
        ar.add("A");
        ar.add("B");
        ar.add("A");
        ar.add("C");
        ar.add("D");
        ar.add("E");
        System.out.println(ar);
        // ar.remove("C");
        ar.remove(3);
        System.out.println(ar);


    }

}
