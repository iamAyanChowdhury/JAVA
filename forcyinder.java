class cylinder
{
    public double radius;
    public double height;

    public double lidArea()
    {
      return Math.PI*radius*radius;
    }
    public double totalSurfaceArea()
    {
      return 2*lidArea()+circumference()*height;
    }
    public double volume()
    {
      return lidArea()*height;
    }
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
}
public class forcyinder 
{
    public static void main(String[] args) 
    {
        cylinder c=new cylinder();
        c.radius=5;
        c.height=5;

        System.out.println(c.lidArea());
        System.out.println(c.totalSurfaceArea());
        System.out.println(c.volume());
        System.out.println(c.circumference());
    }
}
