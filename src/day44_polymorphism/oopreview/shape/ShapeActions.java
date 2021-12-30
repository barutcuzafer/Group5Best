package day44_polymorphism.oopreview.shape;

import java.util.List;

import static day44_polymorphism.oopreview.shape.ShapeManager.*;

public class ShapeActions {
    public static void main(String[] args) {
     drawSquare((Square)buildShape("square"));

     drawShape((List<Shape>) buildShape("shape"));
    }
}
