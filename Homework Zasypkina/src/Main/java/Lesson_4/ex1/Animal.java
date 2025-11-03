package Lesson_4.ex1;

//Все животные могут бежать и плыть.
// В качестве параметра каждому методу передается длина препятствия. Результатом выполнения действия будет печать в консоль.
// (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
public class Animal {
    protected String name;
    protected int swimLimit;
    protected int runLimit;
    private static int count = 0;

    public Animal() {
        count++;
    }

    public static int getCount() {
        return count;
    }

    public void run(int d) {
        if (d <= runLimit) {
            System.out.println(name + " пробежало " + d + "м");
        } else {
            System.out.println("Это животное не может пробежать более " + runLimit + "м");
        }
    }

    public void swim(int s) {
        if (s >= 0) {
            if (s <= swimLimit) {
                System.out.println(name + " проплыло " + s + " м");
            } else {
                System.out.println("Это животное не может проплыть более " + swimLimit + "м");
            }
        } else {
            System.out.println("Нельзя вводить отрицательное значение");
        }
    }
}
