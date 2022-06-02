/*2
Create an abstract class Compartment to represent a rail coach. Provide an abstract function notice in
this class. Derive FirstClass, Ladies, General, Luggage classes from the compartment class. Override the
notice function in each of them to print notice suitable to the type of the compartment. Create a class
TestCompartment . Write main function to do the following: Declare an array of Compartment of size
10. Create a compartment of a type as decided by a randomly generated integer in the range 1 to 4.
Check the polymorphic behavior of the notice method.*/
abstract class Compartment {
    public abstract void notice();
class FirstClass extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: You're in FirstClass");
    }

}
class General extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: You're in General");
    }

}
class Ladies extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: You're in Ladies");
    }

}
class Luggage extends Compartment {

    @Override
    public void notice() {
        System.out.println("Notice: You're in Luggage");
    }

}
public class RailCoach
{

}
}




