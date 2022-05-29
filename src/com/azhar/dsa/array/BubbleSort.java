package com.azhar.dsa.array;

//In Place algorithm
//O(n^2) -> Quadratic


public class BubbleSort implements Sort{
    public static void main(String[] args) {
    sort();
    }

    public static void sort() {
        int[] input = Sort.intArray;
        for( int lastUnsortedArrayIndex = input.length - 1
             ;lastUnsortedArrayIndex > 0
                ; lastUnsortedArrayIndex--){
            for(int unsortedArrayStartIndex = 0
                ; unsortedArrayStartIndex < lastUnsortedArrayIndex
                    ; unsortedArrayStartIndex ++){
                if(input[unsortedArrayStartIndex] > input[unsortedArrayStartIndex + 1])
                    Sort.swap(input,unsortedArrayStartIndex,unsortedArrayStartIndex+1);
            }
        }
        Sort.print(input);
    }
}
