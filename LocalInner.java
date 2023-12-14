class ou
{
    void display()
    {
        class Inner
        {
            void innerdisplay()
            {
                System.out.println("Hello");
            }
        }
         Inner i=new Inner();
         i.innerdisplay();
    }
    

}

public class LocalInner {
    public static void main(String[] args) {
        ou o=new ou();
        o.display();
    }
    
}
