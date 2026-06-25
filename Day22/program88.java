import java.util.*;
class program88
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        String newstr="";
        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)==' ')
                continue;
            else
                newstr+= str.charAt(i);
        }
        System.out.println("String after removing spaces: "+newstr);
        sc.close();
    }
}
