// factorial of a no. using recursion//

public class recursion4 {
    static int factorial(int n)
    {
        if(n==1||n==0)
        {
            return 1;
        }
        else
        {
            int fact=n*factorial(n-1);
            return fact;
        }
    }
    public static void main(String[] args) {
       System.out.println(factorial(5));

    }
    
}
