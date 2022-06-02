/*1
        1.1. Create a class called GeneralBank which acts as base class for all banks. This class has functionality
        getSavingInterestRate and getFixedInterestRate methods, which return the saving a/c rate of interest
        and fixed account rate of interest the specific bank gives. Since GeneralBank cannot say what
        percentage which bank would give, make it abstract.
        1.2. Create 2 subclasses of GeneralBank called ICICIBank and KotMBank. Override the methods from
        base class. ICICI - Savings 4% Fixed 8.5% and KotMBank. - Savings 6% Fixed 9%
        1.3. Create a main method to test the above classes. Try one by one and absorb your finding. a)
        ICICIBank object reference instantiated with ICICIBank class. b) KotMBank object reference instantiated
        with KotMBank class. c) GeneralBank object reference instantiated with KotMBank class. d) GeneralBank
        object reference instantiated with ICICIBank class.
        Abstract Classes*/

 abstract class GeneralBank {

    public abstract double getSavingInterestRate();

    public abstract double getFixedInterestRate();
}
class ICICIBank extends GeneralBank {

    @Override
    public double getSavingInterestRate() {
        return 4.0;
    }

    @Override
    public double getFixedInterestRate() {
        return 8.5;
    }

}
class KotMBank extends GeneralBank {

    @Override
    public double getSavingInterestRate() {
        return 6.0;
    }

    @Override
    public double getFixedInterestRate() {
        return 9.0;
    }

}

 public class AssimentGeneralBank {

    public static void main(String[] args) {
        ICICIBank iciciBank = new ICICIBank();
        KotMBank kotMBank = new KotMBank();

        GeneralBank gb1 = new ICICIBank();
        GeneralBank gb2 = new KotMBank();

        System.out.println("ICICI Bank Saving Interest : "+gb1.getSavingInterestRate());
        System.out.println("ICICI Bank Fixed Interest : "+gb1.getFixedInterestRate());
        System.out.println("kotMBank Saving Interest Rate : "+gb2.getSavingInterestRate());
        System.out.println("kotMBank Fixed Interest Rate : "+gb2.getFixedInterestRate());
    }

}