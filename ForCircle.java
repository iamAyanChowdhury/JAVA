
class circle                               //creating a class//
{
    public double radius;                 //property//

    public double area()                 //calculations/methods/functions//
    {
        return Math.PI*radius*radius;
    }
    public double perimeter()           //calculations/methods/functions//
    {
        return 2*Math.PI*radius;
    }
    public double circumference()      //calculations/methods/functions//
    {
        return perimeter();
    }
}


public class ForCircle {
    public static void main(String[] args) 
    {
        circle c=new circle();              //creating a object 'c'//
        circle c1=new circle();            //creating a object 'c1'//

        c.radius=7;                       //initializing their values//
        c1.radius=5;

        System.out.println((c.area()));
        System.out.println(c.perimeter());
        System.out.println(c.circumference());
        System.out.println("_______");

        System.out.println((c1.area()));
                                                       
    }
    
}
