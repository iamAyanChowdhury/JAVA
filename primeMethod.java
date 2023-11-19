import java.util.Scanner;

public class primeMethod {
    static boolean isPrime(int n)
    {
        for(int i=2;i<n/2;i++)
        {
            if(n%i==0)
            {
                return false;
            }
           
        }
        return true;
        
    }

    public static void main(String[] args) {
        int no;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        no=sc.nextInt();

        System.out.println("The given no is prime :"+isPrime(no));

        
    }

    
}
