package lesson2e7;

import Lesson_4.ex2.Triangle;

//Напишите 4 программы:
//позволяющую вычислить факториал числа;
//позволяющую найти площадь треугольника;
//совершающую арифметические действия с двумя целыми числами (сложение, вычитание, деление и умножение);
//сравнивающую два целых числа.
public class AreaTriangle {
    public static void main(String[] args) {
        Triangle t2 = new Triangle("синий", "голубой", 2, 3, 3);
        System.out.println(t2.area());
    }
}