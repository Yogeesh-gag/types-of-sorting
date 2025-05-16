package org.example;

public class SelectionSort {

    // Method to sort employee IDs using Selection Sort
    public void selectionSort(int[] employeeId) {    // Time complexity is O(n^2)
        int n = employeeId.length; // Get the total number of employee IDs

        // Loop through the array to place elements in correct position
        for (int i = 0; i < n - 1; i++) {
            int smallest = i; // Assume the current index has the smallest value

            // Find the smallest value in the rest of the array
            for (int j = i + 1; j < n; j++) {
                if (employeeId[smallest] > employeeId[j]) {
                    smallest = j; // Update the smallest index if a smaller value is found
                }
            }

            // Swap the smallest value with the current value at index i
            int temp = employeeId[smallest];       // Store smallest value temporarily
            employeeId[smallest] = employeeId[i];  // Move current value to smallest index
            employeeId[i] = temp;                  // Place smallest value at current index
        }
    }

    // Method to print all employee IDs
    public void printEmployeId(int[] employeeId) {
        for (int employeeIds : employeeId) {
            System.out.print(employeeIds + " "); // Print each ID followed by space
        }
    }

    public static void main(String[] args) {
        // Create an array of employee IDs (unsorted)
        int employeeIds[] = {1034, 1021, 1045, 1009, 1088};

        // Create an object of TypesOfSorting to use sorting methods
        SelectionSort t1 = new SelectionSort();

        // Call the selectionSort method to sort the employee IDs in ascending order
        t1.selectionSort(employeeIds);

        // Call the printMarks method to print the sorted employee IDs
        System.out.println("Sorted Employee Id's are: ");
        t1.printEmployeId(employeeIds);
    }
}
