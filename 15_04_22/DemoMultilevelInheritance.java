//Multilevel program
class Student1{
    private int id;
    private String name;
    Student1(int id,String name){
        this.id=id;
        this.name=name;
    }
    int getId(){
        return id;
    }
    String getName(){
        return name;
    }
}
class Marks extends Student1{
    float m1,m2;
    Marks(int id,String name,float m1,float m2){
        super(id, name);
        this.m1=m1;
        this.m2=m2;
    }
    float getM1(){
        return m1;
    }
    float getM2(){
        return m2;
    }
}
class Result extends Marks{
    Result (int id,String name,float m1,float m2){
        super(id, name, m1, m2);
    }
    void show(){
        System.out.println("Id:"+getId());
        System.out.println("Name:"+getName());
        System.out.println(getM1());
        System.out.println(getM2());
    }
}
public class DemoMultilevelInheritance {
    public static void main(String[] args) {
        Result ob;

        ob
                =new Result
                (
                        2, "xyz", 80, 86);

        ob
                .show();
    }
}
