package Lesson_3;

public class Product {
    //1. Создать класс "Товар" с полями: название, дата производства, производитель, страна происхождения, цена,
    // состояние бронирования покупателем.
    //Конструктор класса должен заполнять эти поля при создании объекта.
    //Внутри класса «Товар» написать метод, который выводит информацию об объекте в консоль.
    private final String name;
    private String date;
    private String manufacturer;
    private String country;
    private String price;
    private String reservationStatus;

    public Product(String name, String date1, String manufacturer1, String country1, String price1, String reservationStatus1) {
        this.name = name;
        this.date = date1;
        this.country = country1;
        this.price = price1;
        this.reservationStatus = reservationStatus1;
        this.manufacturer = manufacturer1;
    }

    public void info() {
        System.out.println("Название: " + name + ", Дата изготовления: " + date + ", Изготовитель: " + manufacturer + ", Страна: " + country + ", Цена: " + price + ", Статус бронирования: " + reservationStatus);
    }
}
