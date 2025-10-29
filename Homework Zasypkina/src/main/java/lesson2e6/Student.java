package lesson2e6;

//Создайте класс Student, содержащий следующие характеристики – имя, группа, курс, оценки по предметам.
// Создайте коллекцию, содержащую объекты класса Student. Следует написать метод, который удаляет студентов
// со средним баллом < 3, а также отдельный метод, который переводит студента на следующий курс, если средний балл >= 3.
//Напишите метод printStudents(Set<Student> students, int course), который получает список студентов и номер курса.
//Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
public class Student {
    protected String name;
    protected int course;
    private int[] mark;

    public Student(String name, int group, int course, int[] mark) {
        this.name = name;
        this.course = course;
        this.mark = mark;
    }

    public double averageMark() {
        double sum = 0;
        for (int i = 0; i < mark.length; i++) {
            sum = sum + mark[i];
        }
        return sum / mark.length;
    }
}
