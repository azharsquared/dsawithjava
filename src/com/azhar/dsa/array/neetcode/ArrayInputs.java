package com.azhar.dsa.array.neetcode;

public class ArrayInputs {
    public static int[] uniqueInput = new int[]{1,2,3,4,5,6,7,8};
    public static int[] duplicateInput = new int[]{1,1,2,2,3,3,4,4};
    public static int[] randomInput(){
      return  (int)(Math.random()*10) % 2 == 0 ? uniqueInput : duplicateInput;
    };
}
