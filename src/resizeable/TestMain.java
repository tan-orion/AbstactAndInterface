package resizeable;

public class TestMain {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        System.out.println("Radius before");
        System.out.println(circle.getRadius());
        System.out.println("Radius after");
        circle.resize(100);
        System.out.println(circle.getRadius());

        Rectangle rectangle = new Rectangle(4,5);
        rectangle.resize(100);
        System.out.println(Math.round(rectangle.getArea()));
    }
}
