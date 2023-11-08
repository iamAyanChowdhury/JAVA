import java.util.*;
public class stringbuff
{
    public static void main(String[] args)
    {
        StringBuffer str=new StringBuffer("Ayan");
         StringBuffer str1=str.append("Chowdhury");
        System.out.println(str==str1);
         System.out.println(str1);


    }
}