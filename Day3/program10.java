import java.util.Scanner;
class program10
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int l,u;
        System.out.println("enter range(upper and lower limit):");
        l=sc.nextInt();
        u=sc.nextInt();
        System.out.println("prime numbers between"+l+"and"+u+"are:");
        for(int i=l;i<=u;i++)
        {
           int c=0;
           for(int j=2;j<i;j++)
           {
               if(i%j==0)
               {
                   c++;
                   break;
                }
            }
            if(c==0&&i!=1)
                System.out.println(i);
        }
        sc.close();
    }
}
