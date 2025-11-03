package Lesson_4.ex2;

public class Main {

    static void main() {

        Circle c1 = new Circle("белый", "красный", 15.5F);
        c1.area();
        c1.info();

        Triangle t1 = new Triangle("желтый", "синий", 5, 5, 8);
        t1.area();
        t1.info();

        Rectangle r1 = new Rectangle("коричневый", "фиолетовый", 12, 5);
        r1.area();
        r1.info();
    }
}
