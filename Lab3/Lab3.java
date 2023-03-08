
import java.util.*;

public class Lab3 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      String inputedNums = "";
      ArrayList<Integer> numbers = new ArrayList<Integer>();

      System.out.print("Enter space seperated numbers to print out in reverse (20 MAX): ");
      inputedNums = input.nextLine();
      numbers = getNumericalValues(inputedNums);
      //Will output every number in ArrayList EXCEPT the first one backwards
      for (int i = (numbers.size()-1); i > 0; i--) {
        System.out.print(numbers.get(i) + ", ");
      }

   }

    public static ArrayList<Integer> getNumericalValues(String str) {
        ArrayList<Integer> n = new ArrayList<Integer>();
        while (str.indexOf(" ") != -1) {
            int nextSpace = str.indexOf(" ");
            n.add(Integer.parseInt(str.substring(0,nextSpace)));
            str = str.substring(nextSpace+1);
            if (str.indexOf(" ") == -1) {
                n.add(Integer.parseInt(str.substring(0,str.length())));
            }
        }
        return n;
    }

}