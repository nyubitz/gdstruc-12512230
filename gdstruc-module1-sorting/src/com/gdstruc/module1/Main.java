//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

package com.gdstruc.module1;

public class Main {

    public static void main(String[] args) {

        int[] numbers = new int[10];

        numbers[0] = 68;
        numbers[1] = -12;
        numbers[2] = 43;
        numbers[3] = 2;
        numbers[4] = -5;
        numbers[5] = -19;
        numbers[6] = 22;
        numbers[7] = 341;
        numbers[8] = 90;
        numbers[9] = -127;

        System.out.println("Before selection sort:");
        printArrayElements(numbers);

        selectionSort(numbers);

        System.out.println("\n\nAfter selection sort:");
        printArrayElements(numbers);

    }

    private static void bubbleSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                        int temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                }
            }
        }
    }

    private static void selectionSort(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex--)
        {
            int smallestIndex = 0;

            for (int i = 0; i <= lastSortedIndex; i++){
                if (arr[i] < arr[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[smallestIndex];
            arr[smallestIndex] = temp;
        }
    }

    private static void printArrayElements(int[] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}