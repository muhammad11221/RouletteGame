import java.util.Random;
import java.util.Scanner;

public class RouletteGame {
    public static void main(String[] args) {
        System.out.println("WELCOME! Let's play some Roulette!\n");


        Scanner input = new Scanner(System.in);
        System.out.print("Enter the type of bet you would like to place (red|black|even|odd|high|low): ");
        String bet = input.next();
        System.out.print("Enter in your bet amount: ");
        int x = input.nextInt();


        Random rnd = new Random();
        int num1 = 1 + rnd.nextInt(36);
        //System.out.println("The ball landed on " + num1);
        int num2 = 1 + rnd.nextInt(18);
        //System.out.println("The ball landed on " + num2);
        int num3 = 19 + rnd.nextInt(36);
        System.out.println("The ball landed on " + num1);

        int randBet = 0;
        if (bet.equalsIgnoreCase("even")) {
            if (num1 % 2 == 0) {
                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet. ");
            }
        } else if (bet.equalsIgnoreCase("odd")) {
            if (num1 % 2 == 1) {

                System.out.println("Congratulations, you've won.");
            } else {
                System.out.println("Sorry, you've lost this bet. ");
            }
//**************************************************************************
            if (bet.equalsIgnoreCase("low")) {
                if (num2 % 2 == 0) {
                    System.out.println("Congratulations, you've won.");
                } else {
                    System.out.println("Sorry, you've lost this bet. ");

                }
            } else if (bet.equalsIgnoreCase("high")) {
                if (num3 % 2 == 1) {

                    System.out.println("Congratulations, you've won.");
                } else {
                    System.out.println("Sorry, you've lost this bet. ");
                }

            }
//       else if(num1 % 2 == 1){
//            System.out.printf("Odd");
//        }else if(num1 >= 1 && num1 <= 18){
//            System.out.println("low");
//        }else if(num1 >= 19 && num1 <= 36){
//            System.out.println("High");
//        }

        }
    }
}