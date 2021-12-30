package day44_polymorphism.oopreview.shape;

import java.util.List;
import java.util.Locale;

public class ShapeManager {

    public static Shape buildShape(String type){
      Shape shape=null;
        switch(type.toLowerCase()){
            case "shape":
                shape=new Shape();
                break;
            case "diamond":
                shape=new Diamond();
                break;
            case "square":
                shape=new Square();
                break;
        }
        return shape;

    }
    public static void drawSquare(Square squareObject){
        squareObject.draw();


    }
    public void drawShape(Shape shapeObject){
        shapeObject.draw();
    }
    public static void drawShape(List<Shape> shapeList){
        for(Shape each:shapeList){

        }


    }

}
