class Baba
{
    public Baba()
    {
        System.out.println("non-param constructor of Baba");
    }
    public Baba(int x)
    {
        System.out.println("Param constructor of Baba");
    }
}
class Cheley extends Baba
{
    public Cheley()
    {
        System.out.println("non-param constructor of Cheley");
    }
    public Cheley(int y)
    {
        System.out.println("Param constructor of Cheley");
    }
    public Cheley(int x,int y)
    {
        super(x);
        System.out.println("2 constr");
    }
}

public class pconstrInh2 {
    public static void main(String[] args) {
        // Cheley c1= new Cheley(10);
        Cheley c2=new Cheley(10,20);
    }
    
}
