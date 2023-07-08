package DecoratorDesignPattern2;

public class DecoratorPatternMain {

    public static void main(String[] args) {

        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());

        System.out.println("Circle with normal border");
        circle.draw();
        System.out.println();

        System.out.println("RedCircle");
        redCircle.draw();
        System.out.println();

        System.out.println("RedRectangle");
        redRectangle.draw();
    }
}
