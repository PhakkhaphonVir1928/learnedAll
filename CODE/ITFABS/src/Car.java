public class Car implements Vehicle {

    @Override
    public void startEngine() {

        System.out.println("Using theKey");   
        System.out.println("Insert into keyhole");
        System.out.println("Turn the key");
        System.out.println("Eun");
    }

    @Override
    public void stopEngine() {
        System.out.println("turn Offa/c");
        System.out.println("Turn off the key"); 
        System.out.println("Open the door");}

    @Override
    public int getNumberOfWheels() {
    return 4;    }
    
}
