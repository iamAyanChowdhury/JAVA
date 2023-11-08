import java.util.*;
public class stringPalindrome 
{
    public static void main(String[] args) {
        String str1=("ayan");// we are storing the STRING value for future use //
        StringBuffer str2= new StringBuffer(str1);// taking the STRING as buffer bcz we need to use the reverse() method //
        StringBuffer str3= new StringBuffer(str2.reverse());// now we are reversing the STRING and storing it in str3 //
        String str4=str3.toString();// now we are converting the reversed string (str3) that is in STRINGBUFFER TO STRING bcz we cant compare a STRINGBUFFER AND STRING //
     
      
        if(str1.equals(str4)){                    
            System.out.println("palindrome");
        }
        else
        System.out.println("not");

    }
    
}
