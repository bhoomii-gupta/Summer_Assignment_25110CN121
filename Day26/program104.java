import java.util.*;
class program104
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int score = 0;
        int ans;
        System.out.println("----- QUIZ -----");
        System.out.println("\n1. What is the capital of India?");
        System.out.println("1. Mumbai");
        System.out.println("2. Delhi");
        System.out.println("3. Kolkata");
        System.out.println("4. Chennai");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if(ans == 2)
            score++;
        System.out.println("\n2. Which language is used for Android development?");
        System.out.println("1. Java");
        System.out.println("2. Python");
        System.out.println("3. C");
        System.out.println("4. HTML");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if(ans == 1)
            score++;
        System.out.println("\n3. 5 + 7 = ?");
        System.out.println("1. 10");
        System.out.println("2. 11");
        System.out.println("3. 12");
        System.out.println("4. 13");
        System.out.print("Enter your answer: ");
        ans = sc.nextInt();
        if(ans == 3)
            score++;
        System.out.println("\nYour Score = " + score + "/3");
        sc.close();
    }
}