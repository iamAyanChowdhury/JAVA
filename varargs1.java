public class varargs1 {
    static void show(int...n)
    {
        for (int i : n) 
        {
          System.out.println(i);    
        }
    }
    public static void main(String[] args) {
        int a[]={5,5,6,2,1};
        show(1);
        show(a);
        show(10,20,30);
    }
    
}
