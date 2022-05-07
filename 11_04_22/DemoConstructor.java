class Account
{
    int id;
    String name;
    int balance;
    Account(int id,String name,int balance)
    {
        this.id=id;
        this.name=name;
        this.balance=balance;
        System.out.println("Constructor with args Called ");
    }
    Account()
    {
        id=1;
        name="abc";
        balance=0;
        System.out.println("Constructor Without args called");
    }
    void deposit(int amt)
    {
        balance+=amt;
    }
    void withDraw(int amt)
    {
        balance-=amt;
    }
    void print()
    {
        System.out.println("********************");
        System.out.println("ID : "+id);
        System.out.println("Name : "+name);
        System.out.println("Balance : "+balance);
        System.out.println("********************");
    }
}
public class DemoConstructor
{
    public static void main(String[]args)
    {
        Account ob1=new Account();
        Account ob2=new Account(2,"XYz",1000);
        ob2.deposit(3000);
        ob1.deposit(1500);
        ob1.print();
        ob2.withDraw(2000);
        ob2.print();
    }
}
