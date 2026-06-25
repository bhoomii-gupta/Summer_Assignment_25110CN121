import java.util.*;
class program86
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        str+= ' ';
        int words=0;
        for(int i=str.length()-1;i>=0;i--)
        {
            if(str.charAt(i)==' ')
                words++;
        }
        System.out.println("words :"+words);
        sc.close();
    }
}
