public class SelectionSortExp {

    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;

            // Find the minimum element in the unsorted part of the array
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the found minimum element with the first element
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };

        System.out.println("Original Array:");
        printArray(arr);

        selectionSort(arr);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}

/*
 * This Java program implements the Selection Sort algorithm to sort an array of
 * integers in ascending order. Here's a short description of what the program
 * does:
 * 
 * 1. The `selectionSort` method takes an integer array as input and sorts it
 * using the Selection Sort algorithm.
 * - It iterates through the array, considering each element as the potential
 * minimum.
 * - For each element, it searches the rest of the unsorted portion of the array
 * to find the minimum element.
 * - Once the minimum element is found, it swaps it with the element at the
 * current iteration's position.
 * - This process continues until the entire array is sorted.
 * 
 * 2. The `main` method initializes an integer array with unsorted values,
 * prints the original array, then calls `selectionSort` to sort the array, and
 * finally prints the sorted array.
 * 
 * 3. The `printArray` method is a utility function used to print the contents
 * of an array.
 * 
 * In summary, this program demonstrates the Selection Sort algorithm by sorting
 * an array of integers and displaying both the original and sorted arrays.
 */
