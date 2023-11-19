public class maxmethod {
    static int max(int a[])
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
    public static void main(String[]args)
    {
        int A[]={2,4,5,1};
        int MAX=max(A);
        System.out.println(MAX);
    }
    
}
// max element in an array//
