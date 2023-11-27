// sum of the given n natural no.s//

public class recursion3 
{
    static void printsum(int i,int n,int sum)
    {
        if(i==n)
        {
            sum=sum+i;
            System.out.println(sum);
            return;
        }
        else
        {
            sum=sum+i;
            printsum(i+1, n, sum);
        }
    }
    public static void main(String[] args) {
        printsum(1, 5, 0);
    }
}
