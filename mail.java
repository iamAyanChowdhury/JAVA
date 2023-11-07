//Find if the email id is on gmail//
//Find username & domainname from email id//


import java.util.*;
import java.util.Scanner;
public class mail
{
    public static void main(String[]args)
    {
        String str,username,domainname,addr;
        System.out.println("Please enter your e-mail id: ");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();

        int i=str.indexOf("@");
        username=str.substring(0, i);
        domainname=str.substring(i+1,str.length());
        int j=str.indexOf(".",i+1);
        addr=str.substring(i+1, j);
        System.out.println("Username: "+username);
        System.out.println("domainname: "+domainname);
        System.out.println("Yes it is a gmail id: "+addr.matches("gmail"));
        
      


    }

    
}
