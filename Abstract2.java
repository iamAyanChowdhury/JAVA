abstract class Shape
{
    abstract public double perimeter();
    abstract public double area();
}
class Cir extends Shape
{
    double radius;
    public double perimeter()
    {
        return 2*Math.PI*radius;
    }
    public double area()
    {
        return Math.PI*radius*radius;
    }
}
class Re extends Shape
{
    double length;
    double breadth;
    public double perimeter()
    {
        return 2*(length+breadth);
    }
    public double area()
    {
        return length*breadth;
    }
}
public class Abstract2 {
    public static void main(String[] args) {
        Re rec=new Re();
        rec.length=10;
        rec.breadth=5;
        System.out.println(rec.area());
        
        
    }
    
}
