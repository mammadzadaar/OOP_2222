// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Shapes cr=new Circle(15);
        System.out.println("Circle's area is ---> "+cr.getArea());
        System.out.println("Circle's length is ---->"+cr.getLength());

        Shapes rec=new Rectangle(10,2);
        System.out.println("Rectangle's area is ----->"+rec.getArea());
        System.out.println("Rectangle's perimeter is ---->"+rec.getPerimeter());
    }
}