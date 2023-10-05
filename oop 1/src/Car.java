public class Car {
    // Attributes (variables)
    String brand;
    String model;
    int year;
    boolean isRunning;

    // Methods (functions)
    public void start() {
        isRunning = true;
        System.out.println("The car is now running.");
    }

    public void stop() {
        isRunning = false;
        System.out.println("The car has stopped.");
    }


}
