package E1_W2_U1;

public class FuelConsuption {
    public double kmPerLiter;

    public FuelConsuption(double inputKM, double inputL) throws Exception {
        if (inputL <= 0) {
            throw new Exception("The fuel consumption <Liters> of your trip cannot be lower or equals to 0!\n\n");
        }
        kmPerLiter = inputKM / inputL;
    }

    public void getKmPerLiter() {
        System.out.println("During this trip you have travelled " + kmPerLiter + "Km per liter.");
    }
}
