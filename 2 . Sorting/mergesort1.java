public class MergeSort1 {
   public static void main(String[] args) {
      int[] arr = { 12, 11, 13, 5, 6, 7 };

      System.out.println("Original Array:");
      printArray(arr);

      mergeSort(arr, 0, arr.length - 1);

      System.out.println("\nSorted Array:");
      printArray(arr);
   }

   public static void mergeSort(int[] arr, int left, int right) {
      if (left < right) {
         int mid = (left + right) / 2;

         // Sort the first and second halves
         mergeSort(arr, left, mid);
         mergeSort(arr, mid + 1, right);

         // Merge the sorted halves
         merge(arr, left, mid, right);
      }
   }

   public static void merge(int[] arr, int left, int mid, int right) {
      int n1 = mid - left + 1;
      int n2 = right - mid;

      int[] L = new int[n1];
      int[] R = new int[n2];

      // Copy data to temp arrays L[] and R[]
      for (int i = 0; i < n1; i++) {
         L[i] = arr[left + i];
      }
      for (int j = 0; j < n2; j++) {
         R[j] = arr[mid + 1 + j];
      }

      // Merge the temp arrays back into arr[left..right]
      int i = 0, j = 0, k = left;
      while (i < n1 && j < n2) {
         if (L[i] <= R[j]) {
            arr[k] = L[i];
            i++;
         } else {
            arr[k] = R[j];
            j++;
         }
         k++;
      }

      // Copy remaining elements of L[] if any
      while (i < n1) {
         arr[k] = L[i];
         i++;
         k++;
      }

      // Copy remaining elements of R[] if any
      while (j < n2) {
         arr[k] = R[j];
         j++;
         k++;
      }
   }

   public static void printArray(int[] arr) {
      for (int value : arr) {
         System.out.print(value + " ");
      }
      System.out.println();
   }
}
