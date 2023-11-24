public class varargs4 {
    static int SumOfAllElements(int...A)
    {
        int sum=0;
        for(int i=0;i<A.length;i++)
        {
            sum=sum+A[i];
        }
        return sum;
    }

    public static void main(String[]args)
    {
        int n[]={1,2,2,5};
        System.out.println(SumOfAllElements(n));
        System.out.println(SumOfAllElements(1,2,2,5));
    }
    
}
