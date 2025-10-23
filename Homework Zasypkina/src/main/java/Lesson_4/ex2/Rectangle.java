package Lesson_4.ex2;

public class Rectangle extends Figure {
    int side1;
    int side2;

    public Rectangle(String colorBackground, String colorLine, int side1, int side2) {
        super(colorBackground, colorLine);
        this.side1 = side1;
        this.side2 = side2;
    }

    @Override
    public float area() {
        return side1 * side2;
    }

    @Override
    public void info() {
        System.out.println(colorBackground + ", " + colorLine + ", " + "периметр " + perimeter(side1, side2) + ", площадь " + area());
    }
}
