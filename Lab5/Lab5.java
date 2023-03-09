import java.util.*;

public class Lab5 {
    public static void main(String[] args) { 
       Scanner input = new Scanner(System.in);

        System.out.print("Enter four items, separated by a space: "); 
        String inputedText = input.nextLine();
        String[] textList = getStringValues(inputedText,4);
        input.close();
        int n = 0;

        Stack<String> textStack = new Stack<String>();
        for (int i = 0; i < textList.length; i++) {
            textStack.push(textList[i]);
        }

        System.out.println("Original Stack: " + textStack);
        while (!textStack.empty()) {
            textStack.pop();
            System.out.println("Stack after popping " + (n+1) + " item(s): " + textStack);
            n++;
        }

    }

    public static String[] getStringValues(String str, int l) {
        String[] n = new String[l];
        for (int i = 0; i < n.length-1; i++) {
            int nextSpace = str.indexOf(" ");
            n[i]=(str.substring(0,nextSpace));
            str = str.substring(nextSpace+1);
            if (str.indexOf(" ") == -1) {
                n[n.length-1] = (str.substring(0,str.length()));
            }
        }

        return n;
    }
}


