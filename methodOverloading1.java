//Overloaded method to calculate area//
public class methodOverloading1 {
    static double area(double radius)
    {
      return Math.PI*radius*radius;
    }
    static double area(double length,double breadth)
    {
        return length*breadth;
    }

    public static void main(String[] args) {
        int r=5;
        int l=10;
        int b=20;

        System.out.println(area(r));
        System.out.println(area(l, b));
    }
}
