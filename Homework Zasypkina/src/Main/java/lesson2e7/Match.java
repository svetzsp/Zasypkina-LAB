package lesson2e7;

//Напишите программу, сравнивающую два целых числа.
public class Match {
    private int m1;
    private int m2;

    public Match(int m1, int m2) {
        this.m1 = m1;
        this.m2 = m2;
    }

    public boolean isMatch() {
        if (m1 == m2) {
            return true;
        } else {
            return false;
        }
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

    static void main() {
        Match intMatch = new Match(4, 5);
        System.out.println(intMatch.isMatch());
    }
}
