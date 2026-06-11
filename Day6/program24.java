import java.util.*;
class program24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base (x):");
        int x = sc.nextInt();
        System.out.println("Enter power (n):");
        int n = sc.nextInt();
        int ans = 1;
        for(int i = 1; i <= n; i++)
            ans = ans * x;
        System.out.println(x + "^" + n + " = " + ans);
        sc.close();
    }
}

