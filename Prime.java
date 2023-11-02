import java.util.Scanner;
public class Prime
{
  public static void main(String[]args)
  {
    int n=5,i;
    for(i=2;i<n;i++)
    {
        if(n%i==0)
        {
            System.out.println("not prime");
            return;
        }
    }
    
    System.out.println("prime");
    


  }
}