package DecoratorDesignPattern2;

// the concrete decorator class
public class RedShapeDecorator extends ShapeDecorator {

    public RedShapeDecorator(Shape d) {
        super(d); // invoking the parent constructor.
    }

    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }

    @Override
    public void draw() {
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }


}
