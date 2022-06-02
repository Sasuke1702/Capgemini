//implementing interface into class
interface Aaa {
    void add(int x, int y);
    public abstract void sub(int x, int y);
}

class Testt implements Aaa {
    @Override
    public void sub(int x, int y) {
        System.out.println(x+y);
    }
    @Override
    public void add(int x, int y) {
        System.out.println(x-y);

    }
}
public class ImplementingInterfaceIntoClass {
    public static void main(String[] args) {
        Testt t1 = new Testt();
        t1.add(100, 200);
        t1.sub(90, 10);

    }
}
