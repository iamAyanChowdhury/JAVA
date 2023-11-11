import java.util.Scanner;
import java.util.*;

public class linearsearch {
    public static void main(String[] args) {
        int a[]={23,24,25,26};
        int key;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the key to be searched: ");
        key=sc.nextInt();

        for(int i=0;i<a.length;i++)
        {
            if(a[i]==key)
            {
                System.out.println("Element found at "+i);
                System.exit(i);
            }
        }
        System.out.println("error");

    

    }
    
}
