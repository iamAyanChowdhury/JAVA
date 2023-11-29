class rectangle
{
    private int length;
    private int breadth;

    public rectangle()             //Constructor//
    {
        length=3;
        breadth=2;
    }
    public rectangle(int l,int b)   //Parameterised constructor//
    {
        length=l;
        breadth=b;
    }
    public int area()
    {
        return length*breadth;
    }
}

public class constructor1 {
    public static void main(String[] args) {
        rectangle r=new rectangle();
        System.out.println(r.area());
        
        rectangle r1=new rectangle(4,5);
        System.out.println(r1.area());
    }
    
}
