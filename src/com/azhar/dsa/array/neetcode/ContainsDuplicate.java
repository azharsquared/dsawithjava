package com.azhar.dsa.array.neetcode;

import com.azhar.dsa.array.Sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] input = ArrayInputs.randomInput();
        Sort.print(input);
        System.out.println(containsDuplicate(input));
    }

    //Approach 1
    private static boolean containsDuplicate(int[] randomInput) {
        Set<Integer> nonDuplicateItems = Arrays.stream(randomInput).boxed().collect(Collectors.toSet());
        if(nonDuplicateItems.size() == randomInput.length)
            return false;
        else
            return true;
    }
}
