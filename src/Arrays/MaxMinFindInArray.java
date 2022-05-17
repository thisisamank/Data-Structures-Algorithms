package Arrays;

import Utils.Utils;

import java.util.*;

public class MaxMinFindInArray {
    public static void main(String[] args) {
        printMinMax();
    }

    public static void printMinMax(){
        int[] array = Utils.createArrayAndTakeInput();
        int maximum = Integer.MIN_VALUE, minimum = Integer.MAX_VALUE;
        for (int j : array) {
            if (j < minimum) {
                minimum = j;
            } else if (j > maximum) {
                maximum = j;
            }
        }
        System.out.println("Max Value: " + maximum + "\nMin Value is " + minimum);
    }
    
}
