class Super
{
    void math1()
    {
        System.out.println("Math1");
    }
    void math2()
    {
        System.out.println("Math2");
    }
}
class Sub extends Super
{
  void math2()
  {
    System.out.println("Sub math2");
  }
  void math3()
  {
    System.out.println("Math3");
  }
}
public class DynamicMethod 
{
  public static void main(String[] args) {
    Super sup= new Super();
    sup.math2();
    System.out.println("");
    Sub sb= new Sub();
    sb.math2();
    sb.math3();
    System.out.println("");
    Super su= new Sub();
    su.math2();
  }        
}
