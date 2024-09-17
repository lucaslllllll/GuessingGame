import java.util.Random;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Random rand = new Random();
        int x = rand.nextInt(100);

        Scanner Scan = new Scanner(System.in);
        int guess;
        int guesses = 0;

        do{
            guesses += 1;
            System.out.println("Enter your guess:");
            guess = Scan.nextInt();
            if(guess > x){
                System.out.println("Too big");
            }
            else if(guess < x){
                System.out.println("Too small");
            }
        }while (guess != x);

        System.out.println("Congratulations! Number of guesses = " + guesses);
        if (guesses <= 7){
            System.out.println("You got an impossibly good score!");
        }
        else if (guesses >= 8 && guesses <= 10){
            System.out.println("Good job!");
        }
        else{
            System.out.println("Try the divide and conquer strategy next time!");
        }
    }
}
