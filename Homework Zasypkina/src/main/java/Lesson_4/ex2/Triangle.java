package Lesson_4.ex2;

public class Triangle extends Figure {
    int s1;
    int s2;
    int s3;

    public Triangle(String colorBackground, String colorLine, int s1, int s2, int s3) {
        super(colorBackground, colorLine);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public float area() {
        double p = (s1 + s2 + s3) / 2; // полупериметр
        double area = Math.sqrt(p * (p - s1) * (p - s2) * (p - s3));
        return (float) area;
    }

    @Override
    public void info() {
        System.out.println(colorBackground + ", " + colorLine + ", " + "периметр " + perimeter(s1, s2, s3) + ", площадь " + area());

    }
}
