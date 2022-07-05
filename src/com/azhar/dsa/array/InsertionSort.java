package com.azhar.dsa.array;
/*
 * in place
 * stable
 * more shifting
 * O(n^2.0)
 * */
public class InsertionSort implements Sort{
    public static void main(String[] args) {
        sort();
    }

    private static void sort() {

        int[] input = Sort.intArray;
        for(int indexOfUnsortedArray = 1 ; indexOfUnsortedArray < input.length ; indexOfUnsortedArray++){

            int element = input[indexOfUnsortedArray];
            int indexToTraverse = indexOfUnsortedArray;
            for (;indexToTraverse > 0 &&  element < input[indexToTraverse - 1]; indexToTraverse --){
                input[indexToTraverse] = input[indexToTraverse - 1];
            }
            input[indexToTraverse] = element;
        }
        Sort.print(input);
    }
}
