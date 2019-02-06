import java.util.*;
class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        int c;
        int num=sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        for(int i=0;i<num;i++)
        {
            c=a+b;
            a=b;
            b=c;
            System.out.println(c);
        }
    }
}