public class Demo {

    public static void main(String[] args) {

        Circle c = new Circle();

        c.radius = 5;

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());

        c.radius = -5;

        System.out.println("\nAfter setting radius to -5:");

        System.out.println("Radius: " + c.radius);
        System.out.println("Area: " + c.area());
        System.out.println("Circumference: " + c.circumference());
    }
}