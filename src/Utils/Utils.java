package Utils;

import java.util.Scanner;

public class Utils {
    final static Scanner scanner = new Scanner(System.in);
    public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }
    public static int[] createArrayAndTakeInput(){
        System.out.println("Enter the size of the array");
        final int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter the element at arr[" + i + "]");
            array[i] = scanner.nextInt();
        }
        return array;
    }


}
