import java.util.Scanner;

public class cts
{
    public static void main(String[]args)
    {
        int i=5,j=9,k=6;
        long res=0;
        for(int a=0;;a++)
        {
            int sum=i+a;
            res+=sum;
            if(sum==j)
                break;
        }
        for(int a=1;;a++)
        {
            int diff=j-a;
            res+=diff;
            if(diff==k)
                break;
        }
        System.out.println(res);
    }
}