import java.util.*;
class alldigitscount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int v=n;
        int c=0;
        while(v!=0)
        {
            int r=v%10;
            c++;
            v=v/10;
        }
        System.out.println(c);
    }
}