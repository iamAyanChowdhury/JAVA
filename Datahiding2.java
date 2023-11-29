class Cylinder
{ 
  private double radius;
  private double height;
  //Getter methods//
  public double getRadius()
  {
    return radius;
  }
  public double getHeight()
  {
    return height;
  }
  //Setter methods//
  public void setRadius(double r)
  {
    radius=r;
  }
  public void setHeight(double h)
  {
    height=h;
  }
  //Constructors//
  public Cylinder()
  {
   radius=2;
   height=2;
  }
  public Cylinder(double h,double r)
  {
   height=h;
   radius=r;
  }
  
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
public class Datahiding2 {
    public static void main(String[] args) {
        Cylinder c=new Cylinder();
        c.setRadius(5);
        c.setHeight(5);
        System.out.println(c.circumference());
        
        //Creating an object with Parameterized constructors// 
        Cylinder c1=new Cylinder(2, 2);
        System.out.println(c1.circumference());
       
       //Creating an object with Non-parameteried constructors// 
       Cylinder c2=new Cylinder();
       System.out.println(c2.circumference());
    }
    
}
