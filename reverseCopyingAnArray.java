public class reverseCopyingAnArray 
{
    public static void main(String[] args)
     {
        
    
    int a[]={5,4,3,2,1};
    int b[]=new int[5];

    for(int i=a.length-1,j=0;i>=0;i--,j++)
    {
        
        
            b[j]=a[i];
        
    }
    for (int i : a) {
        System.out.print(i);
        
    }
    System.out.println("");
    for(int x:b)
    {
        System.out.print(x);
    }
    }
}
