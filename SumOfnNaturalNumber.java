public class SumOfnNaturalNumber  
{   
 
static int sumOfNaturalNumbers(int n)   
{   
//formula to calculate the sum of natural numbers      
return n * (n + 1) / 2;   
}   
//main method  
public static void main(String args[])   
{   
int n = 5;   
//calling the method and printing the sum  
System.out.println("Sum of Natural Numbers is: "+sumOfNaturalNumbers(n));   
}   
}   
