package factory;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        // get an object of Circle and call its draw method.
        Shape shape1 = shapeFactory.getShape("CIRCLE");

        // call draw method of Circle
        shape1.draw();

        // Get an object of rectangle and call its draw method.
        Shape shape2 = shapeFactory.getShape("RECTANGLE");

        // call draw method of rectangle
        shape2.draw();

        // get an object of square and call its draw method.
        Shape shape3 = shapeFactory.getShape("SQUARE");

        // call draw method of square
        shape3.draw();
    }

}
