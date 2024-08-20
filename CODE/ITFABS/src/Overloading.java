public class Overloading {
    public static void main(String[] args) {
        myPrint(6);
        myPrint('c');
    }
    static void myPrint(int i) {
        System.out.println("int i = " + i);
    }
static void myPrint(double d) { // same name, different parameters
        System.out.println("double d = " + d);
    }
    
}
