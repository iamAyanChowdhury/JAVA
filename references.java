import java.util.*;
public class references
{
    public static void main(String[]args)
    {
        String str1="Ayan";
        String str2="Ayan";
        String str3=new String("Ayan");

        System.out.println(str1==str2);

        //This compares the references which are different..thats why false is output//
        System.out.println(str1==str3);

        //This compares the values ..thats why true is output//
        System.out.println(str1.equals(str3));
    }
}