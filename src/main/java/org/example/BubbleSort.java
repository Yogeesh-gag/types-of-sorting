package org.example;

public class BubbleSort {

    // Method to sort the marks using Bubble Sort
    public void bubbleSort(int[] marks) {    //time complicity 0(n^2)
        int n = marks.length; // Get the number of elements in the array

        // Outer loop for how many times we need to repeat the process
        for (int i = 0; i < n - 1; i++) {

            // Inner loop to compare and swap adjacent values
            for (int j = 0; j < n - 1 - i; j++) {
                // If the current value is bigger than the next one, swap them
                if (marks[j] > marks[j + 1]) {
                    int temp = marks[j];          // Store current value in temp
                    marks[j] = marks[j + 1];      // Move next value to current position
                    marks[j + 1] = temp;          // Move temp (old value) to next position
                }
            }
        }
    }

    // Method to print all the marks in the array
    public void printMarks(int[] marks) {
        // Loop through each mark in the array
        for (int mark : marks) {
            System.out.print(mark + " "); // Print each mark with a space
        }
    }

    public static void main(String[] args) {
        // Create an array of marks (unsorted)
        int arr[] = {24, 59, 33, 76, 56, 45, 78, 98};

        // Create an object of TypesOfSorting class to use its methods
        BubbleSort t1 = new BubbleSort();

        // Call the bubbleSort method to sort the array
        t1.bubbleSort(arr);

        // Call the printMarks method to display the sorted array
        System.out.println("Sorted student marks :");
        t1.printMarks(arr);

    }
}
