class Circle
{
    // attributes of circle
    float radius, area;
    // action of circle
    void SetRadius(float x)
    {
        radius=x;
    }
    void CalculateArea()
    {
        area=3.14f*radius*radius;
        System.out.println("Area is "+area);
    }
}

public class DemoClass
{
    public static void main(String[]args)
    {
        Circle ob1=new Circle();
        Circle ob2=new Circle();
        ob1.SetRadius(1.2f);
        ob2.SetRadius(3.4f);
        ob1.CalculateArea();
        ob2.CalculateArea();
    }
}
