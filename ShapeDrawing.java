abstract class Shape {
    abstract void draw();  
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

public class ShapeDrawing {
    public static void main(String[] args) {
        Shape[] shapes = { new Circle(), new Rectangle(), new Circle() };

        for (Shape shape : shapes) {
            shape.draw();
        }
    }
}


