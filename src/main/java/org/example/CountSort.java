package org.example;

public class CountSort {

    // Method to perform counting sort on an integer array
    public static void countSort(int[] arr) {
        // Check if the array is null or has 1 or fewer elements (already sorted)
        if (arr == null || arr.length <= 1) {
            return; // No need to sort
        }

        // Step 1: Find the maximum value in the array to determine the size of the count array
        int max = arr[0]; // Initialize max with first element
        for (int num : arr) {
            if (num > max) {
                max = num; // Update max if a larger value is found
            }
        }

        // Step 2: Create the count array with size (max + 1)
        // Each index represents a value from 0 to max, and stores the count (frequency) of that value
        int[] countArray = new int[max + 1];

        // Step 3: Count the frequency of each element in the original array
        for (int num : arr) {
            countArray[num]++; // Increment count at index equal to the number
        }

        // Step 4: Overwrite the original array with sorted elements
        int index = 0; // Pointer to current index in original array
        for (int i = 0; i <= max; i++) {
            // Place the value 'i' in the array as many times as it appeared
            while (countArray[i] > 0) {
                arr[index] = i; // Place value in sorted order
                index++;        // Move to next position
                countArray[i]--; // Decrease count after placing
            }
        }
    }

    // Main method to test the countSort function
    public static void main(String[] args) {
        // Input array of integers to be sorted
        int[] arr = {2, 5, 4, 2, 4, 2, 3, 4, 3, 8};

        // Call counting sort on the input array
        countSort(arr);

        // Print the sorted array
        for (int print : arr) {
            System.out.print(print + " ");
        }
    }
}
