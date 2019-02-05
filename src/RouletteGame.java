import java.util.Random;
import java.util.Scanner;

public class RouletteGame {
    public static void main(String[] args) {
        System.out.println("WELCOME! Let's play some Roulette!\n");

        Boolean quit = true;
        double totalScore = 0;
        int winCont = 0, loseCont = 0;

        Random rnd = new Random();

        while (quit) {

            Scanner input = new Scanner(System.in);
            System.out.print("Enter the type of bet you would like to place (red|black|even|odd|high|low): ");
            String bet = input.next();
            System.out.print("Enter in your bet amount: ");
            int x = input.nextInt();


            int colorRand = rnd.nextInt(2) + 1;
            String color = "";
            if (colorRand == 1) {
                color = "red";
            } else {
                color = "black";
            }

            int num1 = 1 + rnd.nextInt(36);
            System.out.println(("The ball landed on " + num1 + " " + color + "."));

            // int randBet = 0;
            if (bet.equalsIgnoreCase("even") && (num1 % 2 == 0)) {
                System.out.println("Congratulations, you've won.");
                totalScore += x * 2;
                winCont++;

            } else if (bet.equalsIgnoreCase("odd") && (num1 % 2 == 1)) {
                System.out.println("Congratulations, you've won.");
                totalScore += x * 2;
                winCont++;
            } else if (bet.equalsIgnoreCase("low") && (num1 % 2 == 0)) {
                System.out.println("Congratulations, you've won.");
                totalScore += x * 2;
                winCont++;
            } else if (bet.equalsIgnoreCase("high") && (num1 % 2 == 1)) {
                System.out.println("Congratulations, you've won.");
                totalScore += x * 2;
                winCont++;
            } else if (bet.equalsIgnoreCase("red") && color.equals("red")) {
                System.out.println("Congratulations, you've won.");
                totalScore += x * 2;
                winCont++;
            } else if (bet.equalsIgnoreCase("black") && color.equals("black")) {
                System.out.println("Congratulations, you've won.");
                totalScore += x * 2;
                winCont++;
            } else {
                System.out.println("Sorry, you've lost this bet.");
                totalScore = totalScore - x;
                loseCont++;
            }


            System.out.println("You currently have: $" + totalScore + "\n");
            System.out.print("Would you like to play again (true|false)? ");
            quit = input.nextBoolean();
            input.nextLine();
            System.out.println();

        }
        System.out.println("Thank you for playing!");
        System.out.println("This is how much money you have remaining: $"+totalScore);
        System.out.println("You've won "+winCont +" game(s) and lost "+
                loseCont +" game (s).");
    }

}
