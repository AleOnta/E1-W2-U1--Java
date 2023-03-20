package E1_W2_U1;

import java.lang.Math;
import java.util.Scanner;

public class Runnable_E1 {
     private static final Scanner userInput = new Scanner(System.in);
    private static final int[] integerArray = new int[5];
    public static void main(String[] args) throws Exception {
        System.out.println("This is the starting array:");
        fillArrayAtStart();
        printArray();
        arrayElementModifier();
    }

    // method to fill the int[5] with random int numbers from 1 and 10
    private static void fillArrayAtStart() {
        int i = 0;
        while (i < 5) {
            int toPush = (int) (Math.random() * 10) + 1;
            integerArray[i] = toPush;
            i++;
        }
    }

    // method to print in console the formatted array
    private static void printArray() {
        int i = 0;
        while (i < 5) {
            System.out.print("N" + (i+1) + ": " + integerArray[i] + " | ");
            i++;
        }
    }

    private static void arrayElementModifier() throws Exception {
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("\nInsert the index of the element you would like to modify: [index 1 to 5]");
            int index = userInput.nextInt();
            try {
                if (index-1 < 0) {
                    throw new Exception("index can't be lower than 0");
                } else if (index-1 > 4) {
                    throw new Exception("index can't be higher than 5");
                }
                System.out.println("Now insert the value of the element you are modifying: [value between 1 to 10]");
                int value = userInput.nextInt();
                if (value <= 0) {
                    throw new Exception("element value can't be lower than 0");
                } else if (value > 10) {
                    throw new Exception("element value can't be higher than 10");
                }

                integerArray[index-1] = value;
            } catch (Exception e) {
                System.out.println(e + "\n");
            } finally {
                if (index == 0) {
                    isRunning = false;
                    System.out.println("Shutting off the system.");
                } else {
                    printArray();
                }
            }
        }
    }
}
