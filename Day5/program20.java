import java.util.*;
class program20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int largest = 0;
        for(int i = 2; i <= n; i++)
        {
            if(n % i == 0)
            {
                int c=0;
                for(int j = 1; j <= i; j++)
                {
                    if(i % j == 0)
                        c++;
                }
                if(c==2)
                    largest = i;
            }
        }
        System.out.println("Largest prime factor is: " + largest);
        sc.close();
    }
}
