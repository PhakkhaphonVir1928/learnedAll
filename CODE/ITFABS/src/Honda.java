public class  Honda extends Bike {

    @Override
    public void ride() {
        System.out.println("Ride is Safety");
    }

    @Override
    public void changeSpareParts() {
        System.out.println("change Bike body");
    }
    public static void main(String[] args) {
        Honda a = new Honda();
        a.brake();
    }
}
