/*3. Create classes that capture bank customers and bank accounts. A customer has a first and last
name. An account has a customer and a balance. Make objects for two accounts held by the
same customer.*/
import java.util. Scanner;
class Customer
{
    private String fname;
    private String lname;
     void setFname(String fname)
    {
        this.fname=fname;

    }
    String getFname() {
       return this.fname;

    }
    void setlname(String lname)
    {
        this.lname=lname;

    }
    String getlname() {
        return this.lname;

    }
}
class Account
{
    int balance;
    Customer cust;
    void showAccount()

    {
        System.out.println("Enter First name : "+cust.getFname());
        System.out.println("Enter Last name : "+cust.getlname());
        System.out.println("Enter Account Balance : "+balance);
    }
    Account(Customer c, int balance) {
        this.cust=c;
        this.balance=balance;

    }
}

public class Bank
{
    public static void main(String[] args) {
        Customer ob1 = new Customer();
       ob1.setFname("rushi");
       ob1.setlname("gothwal");
       int x=1000;
       Account acc1=new Account(ob1,x);
       Account acc2=new Account(ob1,2000);
        acc1.showAccount();
        acc2.showAccount();
    }
}
