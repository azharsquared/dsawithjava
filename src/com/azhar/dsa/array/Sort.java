package com.azhar.dsa.array;

public interface Sort {
    static int[] intArray = { 88,-5,9,23,4,-54,23};

    static void swap(int[] inputArray,int index,int targetIndex){
        if (index == targetIndex){
            return;
        }
        int temp = inputArray[index];
        inputArray[index] = inputArray[targetIndex];
        inputArray[targetIndex] = temp;
    }

    static void print(int[] inputArray){
        for(int i =0 ; i < inputArray.length ; i ++) {
            System.out.print(inputArray[i] + " ");
        }
    }
}
