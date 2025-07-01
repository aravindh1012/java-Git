public class Car implements Engine, Brake {  // Car class implements both Engine and Brake interfaces

    @Override
    public void brake() {    // Implementing the brake method from Brake interface
        // This method will be called when the brake is applied
        System.out.println("brake applied");
    }

    @Override
    public void start() {
        System.out.println("Engine is started now");
    }

    @Override
    public void Stop() {
        System.out.println("Engine is stopped now");
    }

    @Override
    public void acc() {
       System.out.println("Accelerating the car");
    }

    

    
}
