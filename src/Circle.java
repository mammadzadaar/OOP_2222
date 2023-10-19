public class Circle extends  Shapes{
private double radius;
final double pi=3.14;

public Circle(double radius){
    this.radius=radius;
}
    @Override
    public double getArea() {
        return radius*radius*pi;
    }


    public double getLength() {
return  2*pi*radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
