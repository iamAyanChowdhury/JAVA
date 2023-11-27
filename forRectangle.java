class Rectangle
{
    public int length;
    public int breadth;

    public int area()
    {
        return length*breadth;
    }
    public int perimeter()
    {
        return 2*(length+breadth);
    }
}


public class forRectangle {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.length=3;
        r1.breadth=2;
        System.out.println(r1.area());
        System.out.println(r1.perimeter());
    }


}
