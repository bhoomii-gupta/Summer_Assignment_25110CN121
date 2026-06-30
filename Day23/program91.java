import java.util.*;
class program91
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        if(str1.length() != str2.length())
        {
            System.out.println("Strings are not anagrams.");
            System.exit(0);
        }
        char arr1[] = str1.toCharArray();
        char arr2[] = str2.toCharArray();
        for(int i=0;i<arr1.length-1;i++)
        {
            for(int j=0;j<arr1.length-1-i;j++)
            {
                if(arr1[j] > arr1[j+1])
                {
                    char temp = arr1[j];
                    arr1[j] = arr1[j+1];
                    arr1[j+1] = temp;
                }
            }
        }
        for(int i=0;i<arr2.length-1;i++)
        {
            for(int j=0;j<arr2.length-1-i;j++)
            {
                if(arr2[j] > arr2[j+1])
                {
                    char temp = arr2[j];
                    arr2[j] = arr2[j+1];
                    arr2[j+1] = temp;
                }
            }
        }
         for(int i=0;i<arr1.length;i++)
        {
            if(arr1[i] != arr2[i])
            {
                System.out.println("Strings are not anagrams.");
                System.exit(0);
            }
        }
        System.out.println("Strings are anagrams.");
        sc.close();
    }
}