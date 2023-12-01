class Rec
{
    int l;
    int b;
    public Rec()
    {
        l=b=1;
    }
    public Rec(int l,int b)
    {
        this.l=l;
        this.b=b;
    }
    // public int area()
    // {
    //     return l*b;
    // }
}
class Cuboid extends Rec
{
    int height;
    public Cuboid()
    {
        height=1;
    }
    public Cuboid(int height)
    {
        this.height=height;
    }
    public Cuboid(int l,int b,int height)
    {
        super(l,b);
        this.height=height;
    }
    public int volume()
    {
        return l*b*height;
    }
}
public class pConstrInh3 {
 public static void main(String[] args) {
    Cuboid c=new Cuboid();
    System.out.println(c.volume());

    Cuboid c1=new Cuboid(10);
    System.out.println(c1.volume());

    Cuboid c2=new Cuboid(5, 3, 10);
    System.out.println(c2.volume());
}   
}
