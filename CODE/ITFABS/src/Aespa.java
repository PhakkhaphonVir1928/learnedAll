public class Aespa implements Entertainable {

    @Override
    public void sing() {
        System.out.println("Su-su-su-pernova");
    }

    @Override
    public void dance() {
        System.out.println("Black Mamba Dance");
    }

    @Override
    public void talk() {
        System.out.println("oh, my gosh Don,t you know I'm a savage?");
    }

    @Override
    public void act() {
        System.out.println(Entertainable.PRINCIPLE);
    }
    public static void main(String[] args) {
        Aespa karuna = new Aespa();
        karuna.talk();
        karuna.act();
    }
    
}
