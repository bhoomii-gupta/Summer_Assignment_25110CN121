import java.util.Scanner;

class program2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter a number:");
        n=sc.nextInt();
        System.out.println("multiplication table of "+n+" is:");
        for(int i=1;i<=10;i++)
          System.out.println(n+"*"+i+"="+(n*i));
        sc.close();
    }
}
