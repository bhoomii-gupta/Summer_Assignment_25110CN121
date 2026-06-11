import java.util.*;
class program43
{
    void prime(int n)
    {
        int c=0;
        for(int i=2;i<n;i++)
        {
            if(n%i==0)
            {
                c++;
                break;
            }
        }
        if(c==0)
            System.out.println(n+" is a prime number.");
        else
            System.out.println(n+" is not a prime number.");
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        program43 ob=new program43();
        ob.prime(n);
        sc.close();
    }
}
