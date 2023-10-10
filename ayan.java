import java.util.Scanner;
public class ayan
{
    public static void main(String[]args)
    {
        Scanner s=new Scanner(System.in);
    System.out.println("Enter 1 for addition 2 for substraction 3 for multiplication and 4 for division");
int n=s.nextInt();
int a=s.nextInt();
int b=s.nextInt();
switch(n)
{
    case 1:int sum=a+b;
    System.out.println("sum="+sum);
    break;


    case 2:int substraction=a-b;
    System.out.println("Substraction="+substraction);
    break;


    case 3:int multi=a*b;
    System.out.println("multi="+multi);
    break;


    case 4:int div=a/b;
    System.out.println("div="+div);
    break;

    default:System.out.println("wrong input");
}

    } 

}
