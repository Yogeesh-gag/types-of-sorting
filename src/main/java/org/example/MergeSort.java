package org.example;

public class MergeSort {

    // Method to recursively divide the array into halves
    // Time complexity: O(log n) due to recursive splitting
    public static void divide(double[] arr, int si, int ei) {
        // Base case: if the array has one or zero elements, it's already sorted
        if (si >= ei) {
            return;
        }

        // Calculate the mid-point to divide the array
        int mid = si + (ei - si) / 2;

        // Recursively divide the left half
        divide(arr, si, mid);

        // Recursively divide the right half
        divide(arr, mid + 1, ei);

        // Merge the sorted halves
        conquer(arr, si, mid, ei);
    }

    // Method to merge two sorted halves into one sorted array
    // Time complexity per merge: O(n)
    public static void conquer(double[] arr, int si, int mid, int ei) {
        // Create a temporary array to hold merged elements
        double[] merged = new double[ei - si + 1];

        // Start indexes for both subarrays
        int idx1 = si;       // Start of left half
        int idx2 = mid + 1;  // Start of right half
        int x = 0;           // Index for merged array

        // Compare elements from both halves and merge them in sorted order
        while (idx1 <= mid && idx2 <= ei) {
            if (arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                merged[x++] = arr[idx2++];
            }
        }

        // Copy remaining elements from left half, if any
        while (idx1 <= mid) {
            merged[x++] = arr[idx1++];
        }

        // Copy remaining elements from right half, if any
        while (idx2 <= ei) {
            merged[x++] = arr[idx2++];
        }

        // Copy merged elements back to the original array
        for (int i = 0, j = si; i < merged.length; i++, j++) {
            arr[j] = merged[i];
        }
    }

    // Main method to test merge sort on book prices
    public static void main(String[] args) {
        // Initialize array of unsorted book prices
        double[] bookPrices = {499.99, 299.50, 799.00, 150.00, 620.75};

        int n = bookPrices.length;

        // Call divide to sort the array using merge sort
        divide(bookPrices, 0, n - 1);

        // Print the sorted book prices
        System.out.println("Sorted Book Prices:");
        for (int i = 0; i < bookPrices.length; i++) {
            System.out.print(bookPrices[i] + " ");
        }
    }
}
