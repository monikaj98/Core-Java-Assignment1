import java.util.*;
class secondlast
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i;
        int v=n;
        int c=0;
        while(v!=0)
        {
            v=v/10;
            c++;
        }
        if (c==1)
        System.out.println("-1");
        else
        {
        int a=n/10;
        i=a%10;
        if(i>0)
        System.out.println(i);
            else
            {
                i=0-i;
                System.out.println(i);
            }
        }
        
    }
}