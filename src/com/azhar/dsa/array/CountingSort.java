package com.azhar.dsa.array;

public class CountingSort implements Sort{
    public static void main(String[] args) {
        sort();
    }

    private static void sort() {
        int[] input = {1,2,4,5,1,2,9,5};
        countingSort(input,0,9);
        Sort.print(input);
    }

    private static void countingSort(int[] input, int min, int max) {
        int countingArray[] = new int[(max-min)+1];

        for(int i = 0;i < input.length;i++){
            countingArray[input[i]-min]++;
        }
        int j = 0;
        for (int i = min; i < max;i++){
            while(countingArray[i-min] > 0){
                input[j++] = i;
                countingArray[i-min]--;
            }
        }
    }
}
