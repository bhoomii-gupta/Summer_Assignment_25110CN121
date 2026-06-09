import java.util.*;
class program15
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        int c=0;
        int n1=n;
        while(n1>0)
        {
            c++;
            n1/=10;
        }
        int n2=n;
        int d=0;
        int arm=0;
        while(n2>0)
        {
            d=n2%10;
            arm+=(int)Math.pow(d,c);
            n2/=10;
        }
        if(arm==n)
            System.out.println(n+" is an armstrong number.");
        else
            System.out.println(n+" is not an armstrong number.");
        sc.close();
    }
}

