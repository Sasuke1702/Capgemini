class Testt implements Runnable
{
    Thread t;
    Testt(String n,int p){
        t=new Thread(this);
        t.setName(n);
        t.setPriority(p);
        t.start();
    }
    @Override
    public void run()
    {
        try{
            for(int i=0;i<5;i++){
                System.out.println("Child Thread"+t.getName()+":"+i);
                Thread.sleep(500);
            }
        }catch (Exception e){
            //TODO: handle exception
        }
    }
}
public class ThreadPriority
{
    public static void main(String[] args) {
        Testt t1 = new Testt("A", Thread.MIN_PRIORITY);
        Testt t2 = new Testt("B", Thread.NORM_PRIORITY);
        Testt t3 = new Testt("C", Thread.MAX_PRIORITY);
        try{
            for(int i=0;i<5;i++){
                System.out.println("Main Thread"+i);
                Thread.sleep(1500);
            }
        }catch (InterruptedException e){

        }
    }
}
