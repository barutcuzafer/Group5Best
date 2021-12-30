package day44_polymorphism.oopreview.shape;

public class ShapeTest {
    public static void main(String[] args) {
        Shape diamond=new Diamond();
        Shape square=new Square();
        Object shapeObject=new Shape();
        Object shapeObject1=new Diamond();
        Object shapeObject2=new Square();

        square.draw();
        diamond.draw();

        ((Square) square).squareMethod();



    }
}
