public   class Rectangle extends Shapes {
    public double length;
    public double width;

    public Rectangle(double length,double width){
        this.length=length;
        this.width=width;
    }


    @Override
    public double getArea() {
        return length*width;
    }

    @Override
    public double getLength() {
        return 0;
    }

    public  double getPerimeter()
 {
     return  2*(length+width);
 }


}
