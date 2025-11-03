package lesson2e5;

public class Main {
    //В методе main() вызвать полученный метод, обработать возможные исключения MyArraySizeException и MyArrayDataException
    // и вывести результат расчета.
    static void main() {
        String[][] m = new String[4][4];
        for (int i = 0; i < m.length; i++) {
            for (int j = 0; j < m[i].length; j++) {
                m[i][j] = Integer.toString(i);
            }
        }
        m[3][2] = "text1";
        try {
            myArray(m);
        } catch (MyArraySizeException | MyArrayDataException e) {
            e.printStackTrace();
        }
        //Напишите код для генерации и поимки ArrayIndexOutOfBoundsException.
        try {
            m[15][46] = "ghjj";
        } catch (ArrayIndexOutOfBoundsException p) {
            p.printStackTrace();
        }
        System.out.println("Корректное завершение программы");
    }

    //Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4. При подаче массива другого размера
    // необходимо бросить исключение MyArraySizeException.
    public static void myArray(String[][] t) throws MyArraySizeException, MyArrayDataException {
        if (t.length == 4 && t[0].length == 4) {
            System.out.println("Работа продолжена с массивом 4*4");
        } else {
            throw new MyArraySizeException("Ожидаем массив 4*4");
        }
        //Далее метод должен пройтись по всем элементам массива, преобразовать в int и просуммировать.
        // Если в каком-то элементе массива преобразование не удалось (например, в ячейке лежит символ или текст
        // вместо числа), должно быть брошено исключение MyArrayDataException с детализацией,
        // в какой именно ячейке лежат неверные данные.
        int sum = 0;
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t[0].length; j++) {
                try {
                    int k = Integer.parseInt(t[i][j]);
                    sum = sum + k;
                } catch (NumberFormatException e) {
                    throw new MyArrayDataException("В ячейке [" + i + "]:[" + j + "] некорректные данные.", e);
                }
            }
        }
        System.out.println(sum);
    }
}
