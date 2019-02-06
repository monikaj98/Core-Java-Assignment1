import java.util.*;
class nmultiplem
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int n2=sc.nextInt();
        if(n2%n==0)
            System.out.println("Exactly multiple");
        else
            System.out.println("Else not");
    }
}