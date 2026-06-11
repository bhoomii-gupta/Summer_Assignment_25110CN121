import java.util.*;
class program41
{
    int sum(int a, int b)
    {
        return (a+b);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        program41 ob=new program41();
        System.out.println("sum:"+ob.sum(n1,n2));
        sc.close();
    }
}