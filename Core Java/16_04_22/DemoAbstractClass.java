//what is abstract class
abstract class Aa{
    void show(){
        System.out.println("In A");

    }
    abstract void add(int x,int y);
}
class Bb extends Aa{
    @Override
    void add(int x, int y) {
        System.out.println(x+y);
    }

}
class Demo2{
    public static void main(String[] args) {
        Bb ob=new Bb();
        ob.show();
        ob.add(100, 200);
    }
}

