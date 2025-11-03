package Lesson_4.ex1;

public class Bowl {
    public int food;
    private int capacity;

    //Сделать так, чтобы в миске с едой не могло получиться отрицательного количества еды
    public Bowl(int capacity) {
        this.food = capacity;
    }

    //Добавить метод, с помощью которого можно было бы добавлять еду в миску
    public void addFood() {
        food = capacity;
    }
}
