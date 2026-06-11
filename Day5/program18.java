import java.util.*;
class program18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int n1= n;
        int sum = 0;
        int d,f;
        while(n > 0)
        {
            d=n%10;
            f=1;
            for(int i = 1; i <= d; i++)
                f*=i;
            sum += f;
            n /= 10;
        }
        if(sum==n1)
            System.out.println(n1 + " is a Strong Number.");
        else
            System.out.println(n1 + " is not a Strong Number.");
        sc.close();
    }
}

