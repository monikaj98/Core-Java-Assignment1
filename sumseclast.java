import java.util.*;
class sumseclast
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int num1=n1%10;
        if (num1<0)
        {
            num1=0-num1;
        }
        int num2=n2%10;
        if(num2<0)
        {
            num2=0-num2;
        }
        int sum=num1+num2;
        System.out.println(sum);        
    }
}