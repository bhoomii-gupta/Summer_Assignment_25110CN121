import java.util.*;
class program96
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        for(int i = 0; i < str.length(); i++)
        {
            int j;

            for(j = 0; j < i; j++)
            {
                if(str.charAt(i) == str.charAt(j))
                    break;
            }
            if(j == i)
                System.out.print(str.charAt(i));
        }
        sc.close();
    }
}