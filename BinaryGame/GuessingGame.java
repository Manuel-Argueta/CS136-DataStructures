import TreePackage.*;
import java.util.Scanner;

public class GuessingGame
{
   
	public static void main(String[] args)
	{
      String response;
      DecisionTree<String> gameTree = new DecisionTree<>("Is it in North America?", "Brazil", "U.S.A.");
      do
      {
         System.out.println("Think of a country and I will guess it. ");
         gameTree = play(gameTree);
         System.out.print("Play again? ");
         response = getUserResponse();
      } while (response.toLowerCase().equals("yes"));
      System.out.println("Bye!");
	}  // end main
   
   public static String getUserResponse()
   {
	   TODO
      
      return response;
   } // end getUserResponse
   
   public static boolean isUserResponseYes()
   {
      String answer = getUserResponse();
      if (answer.toLowerCase().equals("yes"))
         return true;
      else
         return false;
   } // end isUserResponseYes
   
   public static DecisionTree<String> play(DecisionTree<String> gameTree)
   {
      TODO // Initialize current node to root
      TODO while loop answer has not been reached
      {
         // Ask current question
         System.out.println(gameTree.getCurrentData());
         if (isUserResponseYes())
            gameTree.advanceToYes();
         else
            TODO
      } // end while
      assert TODO // Assertion: Leaf is reached
      
      // Make guess
      System.out.println("My guess is " + gameTree.getCurrentData() +
                         ". Am I right?");
      TODO if user responds 'yes'
         System.out.println("I win.");
      else
         learn(gameTree);
      
      return gameTree;
   } // end play
   
   // Responds to the user when this program makes a wrong guess and
   // extends the decision tree so that this guess is not made again.
   public static void learn(DecisionTree<String> gameTree)
   {
      System.out.println("I give up; what are you thinking of? ");
	  
	  TODO set correct answer string
	  TODO set current answer string
            
      System.out.println("Give me a question whose answer is yes for " +
                         correctAnswer + " but no for " + currentAnswer);
      String newQuestion = getUserResponse();
      
	  
	  // TODO create a new question with current data
	  // TODO set responses based on current answer and correct answer

   } // end learn
} // end GuessingGame

/* Sample output:
 Think of a country and I will guess it.
 Is it in North America?
 yes
 My guess is U.S.A.. Am I right?
 yes
 I win.
 Play again? yes
 Think of a country and I will guess it.
 Is it in North America?
 no
 My guess is Brazil. Am I right?
 no
 I give up; what are you thinking of?
 England
 Give me a question whose answer is yes for England but no for Brazil
 Is it in Europe?
 Play again? yes
 Think of a country and I will guess it.
 Is it in North America?
 no
 Is it in Europe?
 yes
 My guess is England. Am I right?
 yes
 I win.
 Play again? no
 Bye!
 */
