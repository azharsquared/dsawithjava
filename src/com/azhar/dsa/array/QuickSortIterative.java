package com.azhar.dsa.array;

public class QuickSortIterative extends QuickSort implements Sort{
    public static void main(String[] args) {
        sort();

    }

    private static void sort() {
        int[] input = Sort.intArray;
        int low = 0;
        int high = input.length;
        int[] callStack = new int[high-low];
        int top = 0;
        callStack[top] = low;
        callStack[++top] = high;
        while (top > 0){
            high=callStack[top--];
            low = callStack[top--];
            int pivot = partition(input, low, high);
            if(pivot > low){
                callStack[++top] = low;
                callStack[++top] = pivot;
            }
            if(pivot < high){
                callStack[++top] = pivot + 1;
                callStack[++top] = high;
            }
        }
        Sort.print(input);
    }
}
