import java.util.*;
class uniquedigitcount
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[50];
        int j=0;
        int v=n;
        int c=0;
        while(v!=0)
        {
            int r=v%10;
            a[j]=r;
            j++;
            v=v/10;
        }
        for(int i=0;i<j;i++)
        {
           for(int k=i+1;k<j;k++)
           {
               if(a[i]==a[k])
                   c++;
           }
        }
        System.out.println(c);
        
     
    }
}