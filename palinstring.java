import java.util.*;
class palinstring
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        String r="";
        int n=s.length();
        for(int i=n-1;i>=0;i--)
        {
            r=r+s.charAt(i);
        }
        if(s.equals(r))
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}