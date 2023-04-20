import java.util.*;

public class Lab9 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String studentName;
        double studentGrade;
        
        HashMap<String, Double> studentGrades = new HashMap<String, Double>();
        
        studentGrades.put("Harry Rawlins", 84.3);
        studentGrades.put("Stephanie Kong", 91.0);
        studentGrades.put("Shailen Tennyson", 78.6);
        studentGrades.put("Quincy Wraight", 65.4);
        studentGrades.put("Janine Antinori", 98.2);

        System.out.println("============================================");
        System.out.print("Please enter the name of a student to update: ");
        studentName = input.nextLine();
        if (studentGrades.containsKey(studentName)) {
            System.out.print("Please enter the updated grade for " + studentName + ": ");
            studentGrade = input.nextDouble();
            System.out.println(studentName + "'s Original Grade: " + studentGrades.get(studentName));
            studentGrades.put(studentName,studentGrade);
            System.out.println(studentName + "'s New Grade: " + studentGrades.get(studentName));
        } else {
            System.out.println("This student does not exist.");
        }
        System.out.println("============================================");
     }
}
