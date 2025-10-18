package Lesson_3;
    //3. Создать класс Park с внутренним классом, с помощью объектов которого можно хранить информацию об аттракционах,
    // времени их работы и стоимости.

public class Park {
    String name;
    private Attractions attractions;

    public class Attractions {
        private String attraction;
        private String timeWork;
        private int price;
        public Attractions (String attraction, String timeWork, int price) {
            this.attraction = attraction;
            this.timeWork = timeWork;
            this.price = price;
        }
        public void info() {
        System.out.println(STR."Парк: \{name}, Аттракцион: \{attraction}, Время работы: \{timeWork}, Цена: \{price}");
        }
    }
}