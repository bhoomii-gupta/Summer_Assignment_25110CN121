import java.util.Scanner;
class program4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        int n1=n;
        int d=0;
        while(n>0)
        {
            d++;
            n/=10;
        }
        System.out.println("number of digits in "+n1+" are:"+d);
        sc.close();
    }
}
