import java.util.*;
class program90
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            int count=0;
            for(int j=0;j<str.length();j++)
            {
                if(ch==str.charAt(j))
                    count++;
            }
            if(count>1)
            {
                System.out.println(ch+" is first repeating character.");
                System.exit(0);
            }
        }
        System.out.println("no repeating character found.");
        sc.close();
    }
}