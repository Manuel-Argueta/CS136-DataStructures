import java.util.*;

public class Lab4 {
    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in);
        String inputedNums = "";
        int[] numbers = new int[8];

        System.out.print("Enter 8 randomly ordered integers, separated by space: ");
        inputedNums = input.nextLine();
        numbers = getNumericalValues(inputedNums);
        System.out.println("UNSORTED: " + printArr(numbers));
        System.out.println("SORTED: " + printArr(selectionSort(numbers)));
    }

    public static int[] selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = arr[i], minI = i;
            for (int j = (i+1); j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minI = j;
                }
            };

            int t = arr[i];
            arr[i] = arr[minI];
            arr[minI] = t;
        }

        return arr;
    }

    public static String printArr(int[] nums) {
        String r = "[";
        for (int i = 0; i < nums.length-1; i++) {
            r += nums[i] + ", ";
        }
        return (r + nums[nums.length-1] + "]");
    }

    public static int[] getNumericalValues(String str) {
        int[] n = new int[8];
        for (int i = 0; i < n.length-1; i++) {
            int nextSpace = str.indexOf(" ");
            n[i]=(Integer.parseInt(str.substring(0,nextSpace)));
            str = str.substring(nextSpace+1);
            if (str.indexOf(" ") == -1) {
                n[7] = (Integer.parseInt(str.substring(0,str.length())));
            }
        }

        return n;
    }
}