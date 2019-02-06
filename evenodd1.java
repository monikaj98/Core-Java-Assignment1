import java.util.*;
class evenodd1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        if(c%2==0)
            System.out.println(c+" is even");
        else
            System.out.println(c+" is odd");
    }
}