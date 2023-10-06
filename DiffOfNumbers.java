import java.util.Scanner;

public class DiffOfNumbers
{
    public static void main(String[]args)
    {
        int x,y,diff;
        Scanner sc= new Scanner(System.in);
        System.out.println("Value of x?: ");
        x=sc.nextInt();
         System.out.println("Value of y?: ");
        y=sc.nextInt();
        diff=x-y;
        System.out.println("The difference between the numbers is: " +diff);

    }
}