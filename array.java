import java.util.Scanner;
import java.util.*;

public class array {
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of elements: ");
        n=sc.nextInt();
        int a[]=new int[n];
        
        System.out.println("Enter the elements u want to store: ");
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        a[2]=15;
        System.out.println("The array elements are: ");
        for(int i=0;i<n;i++)
        {
            System.out.println(a[i]);
        }


    }
    
}
