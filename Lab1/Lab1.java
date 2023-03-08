import java.util.Scanner;
import java.util.Random;

public class Lab1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        //Stores the desired number of coin flips
        int numFlips = 0; 
        
        //Prompts user for the number of coin flips they want to simulate
        System.out.print("Enter how many coin flips you would like to produce: ");
        numFlips = input.nextInt();

        //Simulates a coin toss based on the number inputed by user
        for (int i = 0; i < numFlips; i++) {
            System.out.println(coinFlip(rand));
        }
        
   }
   //Defines the coinFlip method to return a String based on a randomly generated integer
   //that is either 0 or 1
    public static String coinFlip(Random rand) {
        int currentRandomNumber = rand.nextInt(2);
        if (currentRandomNumber == 1) {
            return "Heads";
        } else {
            return "Tails";
        }
    } 
}