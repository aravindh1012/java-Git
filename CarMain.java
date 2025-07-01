public class CarMain {   // Main class to demonstrate the functionality of Car, Engine, and Brake interfaces
    public static void main(String[] args) {
        Car car = new Car();   // Create an instance of Car
        car.start();   // Start the engine
        car.acc();   // Accelerate the car
        car.brake();   // Apply the brake
        car.Stop();
        System.out.println("Engine price: " + Engine.price);
    }
}
