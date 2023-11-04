public class regexOne 
{
    public static void main(String[]args)
    {
        String str1="a";
        System.out.println(str1.matches("abc"));

        //any 1 alphabet btw a,b,c should be given//
         System.out.println(str1.matches("[abc]"));
          System.out.println(str1.matches("[a-z][0-9]"));
           System.out.println(str1.matches("[a-z 0-9]"));

    

    }
    
}
