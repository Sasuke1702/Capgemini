abstract  class Account
{
    abstract void calculateIntrest();
}
class Saving extends Account
{

    @Override
    void calculateIntrest() {
        System.out.println("Calculate intrest of saving");
    }
}
class Loan extends Account
{

    @Override
    void calculateIntrest() {
        System.out.println("Calculate intrest of loan");
    }
}
class AccountFactory
{
    static Account getAccount(String type)
    {
        Account obj=null;
        if (type.equalsIgnoreCase("saving"))
        {
            obj=new Saving();
        }
        else if(type.equalsIgnoreCase("loan"))
        {
            obj=new Loan();
        }
        return obj;
    }
}
public class DemoFactory
{
    public static void main(String[] args)
    {
        Account ob1=AccountFactory.getAccount("loan");
        Account ob2=AccountFactory.getAccount("saving");
        ob1.calculateIntrest();
        ob2.calculateIntrest();

    }

}
