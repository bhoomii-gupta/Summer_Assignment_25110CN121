import java.util.*;
class program42
{
    int max(int a, int b)
    {
        return ((a>b)?a:b);
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        program42 ob=new program42();
        System.out.println("Maximum of the two numbers is:"+ob.max(n1,n2));
        sc.close();
    }
}