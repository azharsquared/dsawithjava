package com.azhar.dsa.array;

/*
 * In place algorithm
 * O(n^2) Quadratic
 * doesn't require much swapping as double sort
 * unstable algorithm -> order is not maintained
 *
 * */
public class SelectionSort implements Sort {
    public static void main(String[] args) {
        sort();
    }

    private static void sort() {
        int[] input = Sort.intArray;
        System.out.println(input.length);
        for (int lastUnSortedIndex = input.length - 1; lastUnSortedIndex > 0; lastUnSortedIndex--) {
            int indexOfLargeUnsortedItem = 0;
            for (int unsortedIndex = 0; unsortedIndex <= lastUnSortedIndex; unsortedIndex++) {
                if (input[indexOfLargeUnsortedItem] < input[unsortedIndex]) {
                    indexOfLargeUnsortedItem = unsortedIndex;
                }
            }
            Sort.swap(input, indexOfLargeUnsortedItem, lastUnSortedIndex);
        }
        System.out.println("\nfinal");
        Sort.print(input);
    }
}
