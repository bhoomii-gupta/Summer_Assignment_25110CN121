import java.util.Scanner;
class program7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int prd=1;
        int d=0;
        while(n!=0)
        {
            d=n%10;
            prd*=d;
            n/=10;
        }
        System.out.println("product of digits are:"+prd);
        sc.close();
    }
}