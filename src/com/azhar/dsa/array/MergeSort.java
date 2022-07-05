package com.azhar.dsa.array;

public class MergeSort implements Sort {
    public static void main(String[] args) {
        sort();
    }

    private static void sort() {
        int[] input = Sort.intArray;
//        Sort.print(input);
//        System.out.println("-------------------------------");
//        System.out.println("-------------------------------");
//        System.out.println();
        mergeSort(input, 0, input.length);
        System.out.println("-------------------------------");
        System.out.println("-------------------------------");
        Sort.print(input);
    }

    private static void mergeSort(int[] input, int start, int end) {

//        System.out.println("mergesort of start " +start+" and end "+end);
//        System.out.println("Array");
//        Sort.print(input);
//        System.out.println();

        if (end - start < 2) {
            return;
        }

        int mid = (start + end) / 2;
        mergeSort(input, start, mid);
//        System.out.println("After merge left");
//        System.out.println("-------------------------------");
//        System.out.println("mergesort of start " +start+" and end "+end);
//        System.out.println("Array");
//        System.out.println("-------------------------------");
//        Sort.print(input);
//        System.out.println();
//        System.out.println("-------------------------------");

        mergeSort(input, mid, end);
//        System.out.println("After merge right");
//        System.out.println("-------------------------------");
//        System.out.println("mergesort of start " +start+" and end "+end);
//        System.out.println("Array");
//        System.out.println("-------------------------------");
//        Sort.print(input);
//        System.out.println();
//        System.out.println("-------------------------------");
        merge(input, start, mid, end);
    }

    private static void merge(int[] input, int start, int mid, int end) {

//        System.out.println("merge of start " +start+" and end "+end+" and mid "+mid);
//        System.out.println("-------------------------------");
//        System.out.println("Array");
//        System.out.println("-------------------------------");
//        Sort.print(input);
//        System.out.println();
//        System.out.println("-------------------------------");


        if (input[mid - 1] <= input[mid]) {
            return;
        }

        int i = start;
        int j = mid;
        int tempIndex = 0;

        int[] temp = new int[end - start];
        while (i < mid && j < end) {
            temp[tempIndex++] = input[i] <= input[j] ? input[i++] : input[j++];
        }

        //handling leftovers
//        System.out.println("handling leftovers");
//        System.out.println("Array");
//        System.out.println("-------------------------------");
//        Sort.print(input);
//        System.out.println();
//        System.out.println("-------------------------------");
//        System.out.println("temp");
//        System.out.println("-------------------------------");
//        Sort.print(temp);
//        System.out.println();
//        System.out.println("-------------------------------");
//        System.out.println("values start " +start+" and end "+end+" and mid "+mid);
        System.arraycopy(input, i, input, start + tempIndex, mid - i);
        System.arraycopy(temp, 0, input, start, tempIndex);
    }
}
