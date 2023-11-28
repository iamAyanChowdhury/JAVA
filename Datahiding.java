class Rect
{
    private double length;
    private double breadth;
    // getter//
    public double getLength()
    {
        return length;
    }
    public double getBreadth()
    {
        return breadth;
    }
    //setter//
    public void setLength(double l)
    {
        length=l;
    }
    public void setBreadth(double b)
    {
        breadth=b;
    }

    public double area()
    {
        return length*breadth;
    }
    public double perimeter()
    {
        return 2*(length+breadth);
    }
}



public class Datahiding {
public static void main(String[] args) {
Rect r=new Rect();
r.setLength(10.5);
r.setBreadth(5.5);
System.out.println(r.area());
System.out.println(r.getLength());
System.out.println(r.getBreadth());
}
}
