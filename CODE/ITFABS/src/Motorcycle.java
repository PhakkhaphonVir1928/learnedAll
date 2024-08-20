public class Motorcycle implements Vehicle {

    @Override
    public void startEngine() {
        System.out.println("Start");    }

    @Override
    public void stopEngine() {
        System.out.println("Off");    }

    @Override
    public int getNumberOfWheels() {
    return 2;    }
    
}
