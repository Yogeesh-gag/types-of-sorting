package org.example;

public class QuickSort {
    public static void main(String[] args) {
        // Sample array of product prices to be sorted
        double[] prices = {999.99, 499.50, 1299.00, 799.75, 349.99, 1199.25};

        // Display the array before sorting
        System.out.println("Before Sorting:");
        printArray(prices);

        // Call the quickSort method with initial low and high indices
        quickSort(prices, 0, prices.length - 1);

        // Display the array after sorting
        System.out.println("After Sorting:");
        printArray(prices);
    }

    // Utility method to print elements of the array
    public static void printArray(double[] arr){
        for(double price : arr){
            System.out.print(price + " ");
        }
        System.out.println(); // Print a new line after array
    }

    // Recursive Quick Sort function
    private static void quickSort(double[] arr, int low, int high) {
        // Only proceed if there are at least two elements to sort
        if(low < high){
            // Partition the array and get the pivot index
            int pivot = partition(arr, low, high);

            // Recursively apply quickSort on left sub-array
            quickSort(arr, low, pivot - 1);

            // Recursively apply quickSort on right sub-array
            quickSort(arr, pivot + 1, high);
        }
    }

    // Partition function that rearranges elements around the pivot
    private static int partition(double[] arr, int low, int high) {
        // Choose the last element as pivot
        double pivot = arr[high];

        // i keeps track of the position to place elements smaller than pivot
        int i = low - 1;

        // Traverse from low to high - 1
        for(int j = low; j < high; j++){
            // If current element is smaller than pivot
            if(arr[j] < pivot){
                i++; // Increment index for smaller element

                // Swap arr[i] and arr[j]
                double temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // Place the pivot element at its correct sorted position
        double temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        // Return the pivot index
        return i + 1;
    }
}
