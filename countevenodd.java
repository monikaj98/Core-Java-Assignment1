import java.util.*;
class countevenodd
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0,c1=0;
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            if(n%2==0)
            {
                c++;
            }
            else if(n%2!=0)
            {
                c1++;
            }
        }
        System.out.println(c);
        System.out.println(c1);
    }
   
}