package Lesson_3;
//3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
// времени их работы и стоимости.

public class Park {
    private String name;

    public Park(String name) {
        this.name = name;
    }

    private Attractions attractions;

    public class Attractions {
        private String attraction;
        private String timeWork;
        private int price;

        public Attractions(String attraction, String timeWork, int price) {
            this.attraction = attraction;
            this.timeWork = timeWork;
            this.price = price;
        }

        public void info() {
            System.out.println("Парк: " + name + ", Аттракцион: " + attraction + ", Время работы: "
                    + timeWork + ", Цена: " + price);
        }
    }
}