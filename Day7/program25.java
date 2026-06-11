import java.util.*;
class program25
{
    int fact(int n)
    {
        if(n==0 || n==1)
            return 1;
        else
            return n*fact(n-1);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        program25 ob=new program25();
        System.out.println("Factorial = " + ob.fact(n));
        sc.close();
    }
}