package E1_W2_U1;

import java.lang.Math;
import java.util.Scanner;

public class Runnable_E1 {
    Scanner userInput = new Scanner(System.in);
    private static int[] integerArray = new int[5];
    public static void main() {
        System.out.println("This is the starting array:");
        fillArrayAtStart();
        printArray();
    }

    private static void fillArrayAtStart() {
        int i = 0;
        while (i < 5) {
            int toPush = (int) (Math.random() * 9) + 1;
            integerArray[i] = toPush;
            i++;
        }
    }

    private static void printArray() {
        int i = 0;
        while (i < 5) {
            System.out.print("N." + i + ": " + integerArray[i] + " ");
            i++;
        }
    }
}
