package Lesson_4.ex1;

//У каждого животного есть ограничения на действия (бег: кот 200 м., собака 500 м.; плавание: кот не умеет плавать, собака 10 м.).
public class Dog extends Animal {
    private static int count = 0;

    public Dog() {
        runLimit = 500;
        swimLimit = 10;
        count++;
    }

    public static int getCount() {
        return count;
    }
}
