import java.util.*;
public class maxElementInAnArray {
    public static void main(String[] args) {
        int A[]={78,89,56,29,10,76,65,100};
        int max=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max)
            {
                max=A[i];
            }
        }
        System.out.println(max);

    }
    
}
