package Lesson_4;

public class Circle extends Figure {
    private float radius;
    public Circle(String colorBackground, String colorLine, float radius) {
        super(colorBackground, colorLine);
        this.radius = radius;
    }

//    @Override
//    public float perimeter(float r) {
//        super.perimeter(r);
//        return r;
//    }

    @Override
    public float area() {
        float a = (3.14F*radius*radius);
        return a;
    }

    @Override
    public void info() {
        //System.out.println(STR."радиус \{radius}");
        System.out.println(colorBackground + ", " + colorLine + ", " + "периметр " + perimeter(radius) + ", площадь " + area());

    }
}
