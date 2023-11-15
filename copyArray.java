public class copyArray {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]=new int[10];

        for(int i=0;i<a.length;i++)
        {
            b[i]=a[i];
        }
        
        for (int i : a) {
            System.out.print(i+",");
           
        }
         System.out.println("");
        
        for (int i : b) {
            System.out.print(i+",");
            
            
        }
        
        System.out.println();
        System.out.println(a.length);
        System.out.println(b.length);
    }
    
}
