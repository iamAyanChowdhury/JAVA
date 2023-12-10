interface Test5
{
    public void math1();
    public void math2();
}
class my implements Test5
{
    public void math1()
    {
        System.out.println("Math1 of class my");
    }
    public void math2()
    {
        System.out.println("Math2 of classs my");
    }
}

public class Interface1 {
    public static void main(String[] args) {
        Test5 t=new my();
        t.math1();
    }
    
}
