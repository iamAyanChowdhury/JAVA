import java.util.Scanner;

public class gcdOfTwoNos 
{
    static int gcd(int m,int n)
    {
        while(m!=n)
        {
            if(m>n)
            {
                m=m-n;
            }
            else
            n=n-m;
        }
        return m;
    }

    public static void main(String[] args)
    {
        int M,N;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter M: ");
         M=sc.nextInt();
        System.out.println("Enter N: ");
       
        N=sc.nextInt();

        int c=gcd(M, N);
        System.out.println("The gcd of the given no.s are: "+c);

    }
    
}
