public class Rectangle extends Shape {
    private double  width ;
    private double height;
    //con
    public Rectangle(double width,double height){
        this.width = width;
        this.height = height;
    }
    @Override
    double getArea() {
        return width*height;
    }

    @Override
    double getPerimeter() {
        return (2*width)+(2*height);
    }
    
}
