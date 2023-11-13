public class insertingAnElemntInAnArray 
{
    public static void main(String[] args) 
    {
        int a[]=new int[7];
        a[0]=1; a[1]=2; a[2]=4;a[3]=5;a[4]=6;

        int n=6;

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
          
        }
        System.out.println("");

        int x=3;
        int index=2;

        for(int i=n;i>index;i--)
        {
           a[i]=a[i-1];
        }
        a[index]=x;

        for(int i=0;i<n;i++)
        {
            System.out.print(a[i]+",");
           
        }
    }
    
}

