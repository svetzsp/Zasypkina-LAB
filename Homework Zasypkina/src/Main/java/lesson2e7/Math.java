package lesson2e7;

//Напишите программу, сравнивающую два целых числа.
public class Math {
    public int sum;
    private int m1;
    private int m2;

    public Math(int m1, int m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public int isMatch() {
        if (m1 == m2) {return 0;}
        else if (m1 < m2) {return -1;}
        else {return 1;}
    }

    public int sum() {
        return m1 + m2;
    }

    public int subs() {
        return m1 - m2;
    }

    public int mult() {
        return m1 * m2;
    }

    public int devide() {
        return m1 / m2;
    }
}
