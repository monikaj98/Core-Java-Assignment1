import java.util.*;
class lastdigit
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int num=a%10;
        if(num>0)
        System.out.println(num);
        else if(num<0)
        {
         num=0-num;
        System.out.println(num);
        }
    }
}