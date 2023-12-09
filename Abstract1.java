abstract class Super
{
    public Super()
    {
      System.out.println("Super constructor");
    }
    public void math1()
    {
        System.out.println("Math1 of super");
    }
    //abstract method//
    abstract public void math2();
}

class Sb extends Super{
    
    public void math2()
    {
      System.out.println("Math2 of super");
    }
}


public class Abstract1 {
    public static void main(String[] args) {
        Super s=new Sb();
        s.math2();
            
        
    }
    
}
