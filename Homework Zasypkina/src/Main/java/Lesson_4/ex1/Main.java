package Lesson_4.ex1;

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

        Bowl bowl1 = new Bowl(30);

//Создать массив котов и миску с едой, попросить всех котов покушать из этой миски и потом вывести информацию о сытости
// котов в консоль.
        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat();
        }
        cats[0].name = "Барсик";
        cats[1].name = "Мурзик";
        cats[2].name = "Черныш";

        for (int c = 0; c < cats.length; c++) {
            cats[c].eat(15, bowl1);
        }

        System.out.println(Animal.getCount());
        System.out.println(Cat.getCount());
        System.out.println(Dog.getCount());
    }
}
