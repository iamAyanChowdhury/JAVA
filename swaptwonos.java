import java.util.Scanner;

public class swaptwonos 
{
  public static void main(String[]args)
  {
    int a,b,t;
    Scanner sc=new Scanner(System.in);
    a=sc.nextInt();
    b=sc.nextInt();

    t=a;
    a=b;
    b=t;

    System.out.println(a);
    System.out.println(b);

  }  
}
