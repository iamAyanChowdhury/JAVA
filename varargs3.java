public class varargs3 {
    static int maximum(int...a)
    {
        int max=a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>max)
            {
                max=a[i];
            }
        }
        return max;
    }
    
    public static void main(String[] args) {
        int n[]={10,45,900,50};
        System.out.println(maximum(n));
        
    }
}
