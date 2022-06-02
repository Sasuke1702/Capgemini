class Sharee
{
    int x;
    boolean f=false;
    synchronized void get(){
        try{
            if (f==false){
                wait();
            }
        }catch (Exception e){
            //TODO : handle exception
        }
        System.out.println("Got "+x);
        f=false;
        notify();
    }
    synchronized void set(int y){
        try{
            if (f==true){
                wait();
            }
        }catch (Exception e){
            //TODO : handle exception
        }
        x=y;
        System.out.println("Put "+x);
        f=true;
        notify();

    }
}
class Producerr implements Runnable
{
    Thread t;
    Sharee ob;
    Producerr(Sharee ob1){
        t=new Thread(this);
        ob=ob1;
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            ob.set(i);
            i++;
        }
    }
}
class Consumerr implements Runnable
{
    Thread t;
    Sharee ob;
    Consumerr(Sharee ob1){
        t=new Thread(this);
        ob=ob1;
        t.start();
    }
    @Override
    public void run() {
        int i=0;
        while(true)
        {
            ob.get();
            i++;
        }
    }
}

 class WaitNotify
{
    public static void main(String[] args)
    {
        Sharee ob=new Sharee();
        Producerr p=new Producerr(ob);
        Consumerr c=new Consumerr(ob);
    }
}
