import java.util.Scanner;
class program3
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int f=1;
        for(int i=1;i<=n;i++)
          f*=i;
        System.out.println("factorial of "+n+" is:"+f);
        sc.close();
    }
}
