package E1_W2_U1;

import java.util.Scanner;

public class Runnable_E2 {
    private static final Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Welcome into the system!\n");
        boolean isRunning = true;
        while (isRunning) {
            System.out.println("Please insert the amount of km drove during the trip:");
            System.out.println("Otherwise, hit 0 to exit the system.");
            double km = userInput.nextDouble();
            if (km == 0) {
                isRunning = false;
                System.out.println("Exiting the system, bye!");
            } else {
                System.out.println("Okay then, now insert the amount of fuel liters consumed during the trip:");
                double l = userInput.nextDouble();
                try {
                    FuelConsuption a = new FuelConsuption(km, l);
                    a.getKmPerLiter();
                } catch (Exception e) {
                    System.out.println(e);
                }
            }
        }
    }
}
