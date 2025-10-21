package Lesson_4;
//Добавить подсчет созданных котов, собак и животных.
public class Main {

    static void main() {
        Dog dog1 = new Dog();
        dog1.name = "Бобик";
        dog1.run(505);
        dog1.swim(11);
        dog1.swim(-3);

        Cat cat1 = new Cat();
        cat1.name = "Симка";
        cat1.run(150);
        cat1.run(202);
        cat1.swim(-2);
        cat1.swim(2);

        Circle c1 = new Circle("белый", "красный", 15.5F);
        c1.area();
        c1.info();

        Triangle t1 = new Triangle("желтый", "синий", 5, 5, 8);
        t1.area();
        t1.info();
    }
}
