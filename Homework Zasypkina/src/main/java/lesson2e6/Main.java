package lesson2e6;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

// Создайте коллекцию, содержащую объекты класса Student.
public class Main {
    static void main() {
        Student student1 = new Student("Иванов", 35, 1, new int[]{3, 2, 3, 2, 3});
        Student student2 = new Student("Петров", 35, 1, new int[]{5, 4, 4, 5, 4});
        Student student3 = new Student("Сидоров", 35, 1, new int[]{2, 3, 2, 3, 3});
        ArrayList<Student> students = new ArrayList<>();
        students.add(student1);
        students.add(student2);
        students.add(student3);
        System.out.println(student1.averageMark());
        System.out.println(student2.averageMark());
        System.out.println(student3.averageMark());
        System.out.println(students.size());
        fired(students);
        transfer(students);
        Set<Student> studentsSet = new HashSet<>(students);
        printStudents(studentsSet, 2);
        PhoneBook Toliatty = new PhoneBook();
        Toliatty.add("+789", "Иванов");
        Toliatty.add("+345", "Иванов");
        Toliatty.add("+123", "Сидоров");
        Toliatty.get("Иванов");
    }

    // Следует написать метод, который удаляет студентов со средним баллом < 3,
    public static void fired(ArrayList<Student> s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).averageMark() < 3) {
                System.out.println("Студент " + s.get(i).name + " удален из списка");
                s.remove(i);
            }
        }
    }

    // а также отдельный метод, который переводит студента на следующий курс, если средний балл >= 3.
    public static void transfer(ArrayList<Student> s) {
        for (int i = 0; i < s.size(); i++) {
            if (s.get(i).averageMark() >= 3) {
                s.get(i).course++;
                System.out.println("Студент " + s.get(i).name + " переведен на следующий курс");
            }
        }
    }

    //Напишите метод printStudents(Set<Student> students, int course), который получает список студентов и номер курса.
//Метод печатает на консоль имена тех студентов, которые обучаются на данном курсе.
    public static void printStudents(Set<Student> students, int course) {
        for (Student person : students) {
            if (person.course == course) {
                System.out.println(person.name + " курс " + course);
            }
        }
    }
}