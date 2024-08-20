public abstract class Shape {
     abstract double getArea();
    abstract double getPerimeter();
    public void printlnfo(){
        System.out.println("Area: " +getArea());
        System.out.println("Perimeter: " +getPerimeter());
    }
}
