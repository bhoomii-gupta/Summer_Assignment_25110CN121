import java.util.Scanner;
class program9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
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
            System.out.println("prime number.");
        else
            System.out.println("not a prime number.");
        sc.close();
    }
}
