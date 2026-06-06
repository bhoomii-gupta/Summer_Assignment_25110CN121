import java.util.Scanner;

class program1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
          sum+=i;
        System.out.println("sum of first "+n+" natural numbers is:"+sum);
        sc.close();
    }
}