import java.util.*;
class program92
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();
        int maxCount = 0;
        char maxChar = ' ';
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            int count = 0;

            for(int j = 0; j < str.length(); j++)
            {
                if(ch == str.charAt(j))
                {
                    count++;
                }
            }
            if(count > maxCount)
            {
                maxCount = count;
                maxChar = ch;
            }
        }

        System.out.println("Maximum occurring character: " + maxChar);
        System.out.println("Frequency: " + maxCount);
        sc.close();
    }
}