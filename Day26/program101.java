import java.util.*;

class program101
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Random r = new Random();

        int number = r.nextInt(100) + 1;

        int guess;

        do
        {
            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if(guess > number)
                System.out.println("Too High!");
            else if(guess < number)
                System.out.println("Too Low!");
            else
                System.out.println("Congratulations! You guessed the correct number.");

        } while(guess != number);

        sc.close();
    }
}