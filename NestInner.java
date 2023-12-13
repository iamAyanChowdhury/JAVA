class Outer
{
    int x=10;
    class Inner
    {
        int y=20;
        public void innerdisplay()
        {
          System.out.println(x+" "+y);
        }
    }
    public void outerdisplay()
    {
        Inner i=new Inner();
        i.innerdisplay();
        System.out.println(x);
        System.out.println(i.y);
    }

}
public class NestInner {
    public static void main(String[] args) {
        Outer o=new Outer();
        o.outerdisplay();
    }
}
