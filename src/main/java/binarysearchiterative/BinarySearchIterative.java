package binarysearchiterative;

/* This program is a binary search algorithm using an iterative approach. The performance of this algorithm is O(logN)
This means if you have 100 elements in the array then you need O(log2 100)
i.e. 10 iterations to actually find the value or confirm that it doesn't exist in the array. */

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchIterative {

    public static void main(String[] args) {

        Scanner CLIreader = new Scanner(System.in);
        System.out.println("Welcome to Java Program to perform binary search on int array");
        System.out.print("Enter total number of elements: ");
        int length = CLIreader.nextInt();
        int[] input = new int[length];

        System.out.printf("%n Enter %d integers %n", length);
        for (int i = 0; i < length; i++) {
            input[i] = CLIreader.nextInt();
        }

        //Binary search requires a sorted array to work
        Arrays.sort(input);
        System.out.println("Sorted array: ");
        for (int num : input) {
            System.out.print(num + ", ");
        }
        System.out.print("Please enter number to be searched in array (sorted order): ");
        int key = CLIreader.nextInt();
        int index = performBinarySearch(input, key);

        if (index == -1) {
            System.out.printf("Sorry, %d is not found in array %n", key);
        } else {
            System.out.printf("%d is found in array at index %d %n", key,
                    index);
        }

        CLIreader.close();
    }

    /**
     * Java method to perform binary search. It accept an integer array and a
     * number and return the index of number in the array. If number doesn't
     * exists in array then it returns -1
     * @param inputArray a sorted array of integers
     * @param targetValue the value to search for in the inputArray
     * @return index of given number in array or -1 if not found
     */
    public static int performBinarySearch(int[] inputArray, int targetValue) {

        int low = 0;
        int high = inputArray.length -1;

        while (high >= low) {
            int middle = (low + high) / 2;
            if (inputArray[middle] == targetValue) {
                return middle;
            } else if (inputArray[middle] < targetValue) {
                low = middle + 1;
            } else if (inputArray[middle] > targetValue) {
                high = middle - 1;
            }
        }
        return -1;
    }
}


