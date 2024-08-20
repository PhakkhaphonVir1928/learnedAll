public class Circle extends Shape {
    private double redius;
    //con
    public Circle(double redius){
        this.redius = redius;
    }
    @Override
    double getArea() {
    return Math.PI*Math.pow(redius, 2);
    }

    @Override
    double getPerimeter() {
        return 2*Math.PI*redius;
    }
    
}
