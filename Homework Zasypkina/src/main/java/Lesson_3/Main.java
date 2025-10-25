package Lesson_3;

public class Main {
    //1. Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена,
    // состояние бронирования покупателем.
    //Конструктор класса должен заполнять эти поля при создании объекта.
    //Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
    static void main() {
        Product good1 = new Product("Ball", "12/12/2012", "LLC", "Japan", "125", "2");
        good1.info();
        Product good2 = new Product("Umbrella", "15/03/2005", "OOP", "Korea", "13", "3");
        good2.info();

        //2. Создать массив из 5 товаров.
        //Пример:
        //// вначале объявляем массив объектов
        //Product[] productsArray = new Product[5];
        //// потом для каждой ячейки массива задаем объект
        //productsArray[0] = new Product("Samsung S25 Ultra", "01.02.2025",
        //               "Samsung Corp.", "Korea", 5599, true);

        Product[] productMass = new Product[5];
        productMass[0] = new Product("Heat", "08/08/1970", "Corp", "India", "95", "2");
        productMass[1] = new Product("Socks", "02/03/2015", "Lim", "Korea", "3", "1");
        productMass[2] = new Product("Chair", "01/04/2025", "EAM", "England", "14", "3");
        productMass[3] = new Product("Bag", "16/03/2024", "LOO", "Japan", "35", "1");
        productMass[4] = new Product("Tent", "21/05/2023", "CHJOU", "China", "183", "3");
        for (int i = 0; i < productMass.length; i++) {
            productMass[i].info();
        }

        Park Luna = new Park("Luna-park");

        Park.Attractions Cars = Luna.new Attractions("Cars", "14.00:19.00", 10);
        Cars.info();

        Park.Attractions Ninja = Luna.new Attractions("Ninja", "10:00-18:00", 8);
        Ninja.info();

        Park Gorky = new Park("Горький");
        Park.Attractions CarsGorky = Gorky.new Attractions("Cars", "14:00-19:00", 10);
        CarsGorky.info();
    }
}