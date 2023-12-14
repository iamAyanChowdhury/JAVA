class out{
    int x=10;
    static int y=20;

    static class inner{
        public void show()
        {
            System.out.println(y);
        }

    }
    public void outdisplay()
    {
        inner i=new inner();
        i.show();
    }
}

public class StaticInner {
    public static void main(String[] args) {
        out ou=new out();
        ou.outdisplay();
    }
    
}
