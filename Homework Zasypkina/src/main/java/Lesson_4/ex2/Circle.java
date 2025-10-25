package Lesson_4.ex2;

public class Circle extends Figure {
    private float radius;

    public Circle(String colorBackground, String colorLine, float radius) {
        super(colorBackground, colorLine);
        this.radius = radius;
    }

    @Override
    public float area() {
        return 3.14F * radius * radius;
    }

    @Override
    public void info() {
        //System.out.println(STR."радиус \{radius}");
        System.out.println(colorBackground + ", " + colorLine + ", " + "периметр " + perimeter(radius) + ", площадь " + area());
    }
}
