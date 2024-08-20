public class BMX extends Bike {

    @Override
    public void ride() {
        System.out.println("Julie's Twerk");    }

    @Override
    public void changeSpareParts() {
        System.out.println("Change chain");
        System.out.println("Add oil");
        System.out.println("Change wheels");
    }
    @Override
    public void brake(){
        System.out.println("Egg E Egg Egg");
    }
    public static void main(String[] args) {
        Bike a = new BMX ();
        a.ride();
        a.brake();
    }
}
