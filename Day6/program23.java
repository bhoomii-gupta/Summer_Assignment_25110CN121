import java.util.*;
class program23
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n = sc.nextInt();
        int c=0;
        int rem=0;
        while(n > 0)
        {
            rem=n%2;
            if(rem==1)
                c++;
            n=n/2;
        }
        System.out.println("Number of set bits = "+c);
        sc.close();
    }
}
