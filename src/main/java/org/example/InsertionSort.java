package org.example;

// Class to perform Insertion Sort on employee IDs
public class InsertionSort {

    // Method to sort the employee IDs using Insertion Sort
    public void insertionSort(int[] employeesId) {
        int n = employeesId.length;

        // Traverse from the second element to the end of the array
        for (int i = 1; i < n; i++) {

            int current = employeesId[i];  // Current element to be inserted
            int j = i - 1;

            // Move elements of the sorted part that are greater than current
            // one position ahead to make space for current
            while (j >= 0 && current < employeesId[j]) {
                employeesId[j + 1] = employeesId[j];  // Shift element to right
                j--;  // Move to the previous element
            }

            // Insert the current element into its correct position
            employeesId[j + 1] = current;
        }
    }

    // Method to print the sorted array of employee IDs
    public void printSortedElements(int[] employeeIds) {
        for (int employeeId : employeeIds) {
            System.out.print(employeeId + " ");  // Print each ID followed by space
        }
    }

    // Main method - entry point of the program
    public static void main(String[] args) {

        // Array of unsorted employee IDs
        int[] employeeIds = {1034, 1021, 1045, 1009, 1088};

        // Create an object of InsertionSort class
        InsertionSort i1 = new InsertionSort();

        // Sort the employee IDs using insertion sort
        i1.insertionSort(employeeIds);

        // Print message
        System.out.println("Printing the sorted employee ID's using insertion sort:");

        // Call method to print sorted employee IDs
        i1.printSortedElements(employeeIds);
    }
}
