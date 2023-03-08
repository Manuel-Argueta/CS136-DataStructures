import java.util.Scanner; 
public class Lab2 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int userNumber;
    System.out.print("Enter a decimal number to convert to reverse binary: ");
    userNumber = input.nextInt(); 
    String reverseBinary = "";

    while (userNumber > 0) {
        reverseBinary += userNumber%2;
        userNumber /= 2;
    }

    System.out.println(reverseBinary);
   }
}