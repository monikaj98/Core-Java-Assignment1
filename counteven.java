import java.util.*;
class counteven
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int c=0;
        for(int i=0;i<5;i++)
        {
            int n=sc.nextInt();
            if(n%2==0)
            {
                c++;
            }
        }
        System.out.println(c);
    }
   
}