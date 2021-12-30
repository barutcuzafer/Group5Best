package day44_polymorphism.oopreview.shape;

public class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Drawing a square");
    }

    public Square(){
        type="square";

    }
    public void squareMethod(){
        System.out.println("Square Method");
    }
}
