import java.util.Random;
import java.util.Scanner;


public class ch_2 {
    public static void main(String[] args) {
// random number
        Random Number = new Random();

        Scanner sc = new Scanner(System.in);

//setting limit of random numbers
        int random = Number.nextInt(3);

        //displaying game name
        System.out.println("__ROCK-PAPERS-SCISSORS__");

        //taking input from player
        System.out.println("press 0/1/2 to " +
                "choose rock, paper or scissors");
        int choice = sc.nextInt();

        //using switch to display choice name.
        switch (random) {
            case 0 -> System.out.println("comp choice= ROCK");
            case 1 -> System.out.println("comp choice= PAPERS");
            case 2 -> System.out.println("comp choice= SCISSORS");
        }

        switch (choice) {
            case 0 -> System.out.println("players choice= ROCK");
            case 1 -> System.out.println("players choice= PAPERS");
            case 2 -> System.out.println("payers choice= SCISSORS");
        }

        //setting conditions for the game
        if (random == choice) {
            System.out.println("Its a tie!");

        } else if (random == 0 && choice == 2 || random == 1 && choice == 2 || random == 2 && choice == 0) {
            System.out.println("You lose! and computer wons!");

        } else if (choice == 3) {
            System.out.println("please choose between 0-2");
        } else {
            System.out.println("You won! computer lose!");
        }

    }

}
