import java.util.*;
class nthprime
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int c=0,f=0;
        for(int i=2;i<1000;i++)
        {
            f=0;
            for(int j=2;j<=i/2;j++)
            {
                if(i%j==0)
                {
                    f=1;
                    break;
                }
            }
            if(f==0)
                c++;
            if(c==n)
            {
                System.out.println(i);
                break;
            }
        }
    }
}