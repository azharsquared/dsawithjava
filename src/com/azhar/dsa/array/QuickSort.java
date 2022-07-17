package com.azhar.dsa.array;

import java.util.Arrays;

public class QuickSort implements Sort{
    
    public static void main(String[] args) {
        sort();
    }

    public static void sort(){
        int[]  input = Sort.intArray;
        int [] referenceInput = Arrays.copyOf(input,input.length);
        quickSort(input,0,input.length);
        Arrays.sort(referenceInput);
        int result = Arrays.compare(referenceInput, input);
        System.out.println(result);
        Sort.print(input);
    }

    private static void quickSort(int[] input, int start, int end) {
        if(end - start < 2){
            return;
        }
        int pivot = partition(input,start,end);
        quickSort(input,start,pivot);
        quickSort(input,pivot+1,end);
    }

    private static int partition(int[] input, int start, int end) {
        int i = start,j=end;
        int pivot = input[start];
        while (i < j ){
            //traversing to find item less than pivot
            while(i < j && pivot <= input[--j]);
            if(i < j){
                input[i] = input[j];
            }
            //traversing to find item greater than pivot
            while (i < j && pivot >= input[++i]);
            if(i < j){
                input[j] = input[i];
            }
        }
        input[j]=pivot;
        return j;
    }

}
