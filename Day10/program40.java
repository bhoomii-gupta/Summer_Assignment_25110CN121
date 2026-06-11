import java.util.*;
class program40
{
    public static void main(String[] args) 
    {
        for(int i=1;i<=5;i++) 
        {
            for(int j=i;j<5;j++) 
                System.out.print(" ");
            for(int k=0;k<i;k++)
                System.out.print((char) ('A' + k));
            for(int k=i-2;k>=0;k--) 
                System.out.print((char) ('A' + k));
            System.out.println();
        }
    }
}
