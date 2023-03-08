public class ClassNotes {
   public static void main(String[] args) {
      int[] arr = {2, 8, 4, 33, 7, 0, 9, 1};
      //selectionSort(arr);
        for (int i : arr) {
            System.out.println(i);
        }
   }
    public static int[] mergeSort(int[] arr,int p) { 
        int[] t = new int[arr.length];
        
    }
    // public static int[] selectionSort(int[] arr) {
    //     for (int i = 0; i < arr.length-1; i++) {
    //         int min = Integer.MIN_VALUE, minI = 0;
    //         for (int j = (i+1); j < arr.length; j++) {
    //             if (arr[j] > min) {
    //                 min = arr[j];
    //                 minI = j;
    //             }
    //         };
    //         int t = arr[i];
    //         arr[i] = arr[minI];
    //         arr[minI] = t;
    //     }

    //     return arr;
    // }

    public static void swap(int b, int a, int[] arr) {
        int t = arr[a];
        arr[a] = arr[b];
        arr[b] = t;
    }

    // public static int getMin(int j, int[] arr) {
    //     int min = Integer.MIN_VALUE, minI = 0;
    //     for (int i = (j); i < arr.length; i++) {
    //         if (arr[i] > min) {
    //             min = arr[i];
    //             minI = i;
    //         }
    //     }
    //     return minI;
    // }

}




















