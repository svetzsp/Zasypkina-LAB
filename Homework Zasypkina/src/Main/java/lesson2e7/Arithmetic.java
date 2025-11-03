package lesson2e7;

//Напишите программу, совершающую арифметические действия с двумя целыми числами (сложение, вычитание, деление и умножение);
public class Arithmetic {
    static void main() {
        Match intSum = new Match(65, 80);
        System.out.println(intSum.sum());

        Match intSubs = new Match(100, 35);
        System.out.println(intSubs.subs());

        Match intMult = new Match(46, 52);
        System.out.println(intMult.mult());

        Match intDevide = new Match(15, 65);
        System.out.println(intDevide.devide());
    }
}