import java.util.*;
class program87
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        System.out.print("Enter character to find frequency: ");
        char ch = sc.next().charAt(0);
        int c=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==ch)
                c++;
        }
        System.out.println("Frequency = " + c);
        sc.close();
    }
}
