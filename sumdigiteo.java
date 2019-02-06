import java.util.*;
class sumdigiteo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0,sum1=0;
        while(n!=0)
        {
            int r=n%10;
            if(r%2!=0)
            {
            sum=sum+r;
            }
            else if(r%2==0)
            {
            sum1=sum1+r;
            }
            n=n/10;
        }
        System.out.println(sum);
        System.out.println(sum1);
    }
}