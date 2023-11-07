import java.util.*;
public class regexTwo 
{
    public static void main(String[]args)
    {
        //Find if a number is Binary or not//
        int b=101110001;
        String str1=String.valueOf(b);
        System.out.println(str1.matches("[01]*"));

        //Find if a number is Hexa-Decimal or not//
        String str2="234AZ";
        System.out.println(str2.matches("[0-9A-Z]+"));

        //Find if the data in date format(dd/mm/yyyy)//
        String str3="29/12/2000";
        System.out.println(str3.matches("[0-3][0-9]/[01][0-9]/[0-9]{4}"));

        //Remove special character//
        String str4="a!B@c#|$2%3";
        System.out.println(str4.replaceAll("[^a-z A-Z 0-9]","" ));
    }
}
