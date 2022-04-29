package Arrays;

import Utils.Utils;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Utils.printArray(arr);
        reverseArray(arr);
        Utils.printArray(arr);
    }

    public static int[] reverseArray(int[] array){
        for (int i = 0; i < array.length / 2; i++) {
            int lastPosition = array.length - 1 - i;
            int firstValue = array[i];
            int lastValue = array[lastPosition];
            array[i] = lastValue;
            array[lastPosition] = firstValue;
        }
        return array;
    }
}
