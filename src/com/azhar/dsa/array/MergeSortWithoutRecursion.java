package com.azhar.dsa.array;

public class MergeSortWithoutRecursion implements Sort{

    public static void main(String[] args) {
        sort();
    }

    private static void sort() {
        
        int[] input = Sort.intArray;
        int inputLength = input.length;
        //split
        for(int size = 1;size < inputLength;size*=2){
            for(int start = 0;start<inputLength-1;start+=2*size){
                int mid = Math.min(start + size , inputLength);
                int right_end = Math.min(start
                        + 2*size , inputLength);
                mergeArray(input,start,mid,right_end);
            }
        }
        //merge
        Sort.print(input);
    }

    private static void mergeArray(int[] input, int start, int mid, int end) {
//        System.out.println();
//        Sort.print(input);

        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int[] tempArray = new int[end-start];
       int tempArrayIndex = 0;
       int localStart = start;
       //int localEnd = end;
       int localMid = mid;
       while(localStart<mid && localMid<end){
           tempArray[tempArrayIndex++] = input[localStart]<input[localMid]?input[localStart++]:input[localMid++];
       }
       //leftover
        //move large values to its position
        System.arraycopy(input, localStart, input, start + tempArrayIndex, mid - localStart);
       //copy lower values to its position
        System.arraycopy(tempArray, 0, input, start, tempArrayIndex);
//        System.out.println();
//        Sort.print(input);
    }
}
