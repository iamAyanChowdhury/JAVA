class P
{
    public void display()
    {
        System.out.println("Hello");
    }
}
class C extends P
{
    public void display()
    {
        System.out.println("Hello world");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        P p=new P();
        p.display();
        
        C c=new C();
        c.display(); //the method in the C class overshadows the method in the P class//
        
        //upcasting//
        P p1=new C();
        p1.display(); //Dynamic method dispatch//

    }
    
}
