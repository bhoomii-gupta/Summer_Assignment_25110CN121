import java.util.*;
class program16
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the range(upper and lower limit):");
        int l=sc.nextInt();
        int u=sc.nextInt();
        System.out.println("Armstrong numbers between"+l+"and"+u+"are:");
        for(int n=l;n<=u;n++)
        {
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
            System.out.println(n);
    }
        sc.close();
    }
}
