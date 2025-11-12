package lesson2e7Tests;

import Lesson_4.ex2.Triangle;
import lesson2e7.Factorial;
import lesson2e7.Math;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class junitTests {
    Math match1;
    Math match2;
    Math match3;
    Math sum1;
    Math subs1;
    Math mult1;
    Math dev1;
    Triangle t3;

    @BeforeEach
    public void setUp() {
        match1 = new Math(20, 20);
        match2 = new Math(3, 5);
        match3 = new Math(13, 8);
        sum1 = new Math(65, 38);
        subs1 = new Math(17, 23);
        mult1 = new Math(15, 2);
        dev1 = new Math(50, 2);
    }

    @Test
    @DisplayName("Сравнение меньшего числа с бОльшим")
    public void testMatchLess() {
        int result = match2.isMatch();
        assertEquals(-1, result, "3 должно быть меньше 5");
    }

    @Test
    @DisplayName("Сравнение эквивалентных чисел")
    public void testMatchEqual() {
        int result = match1.isMatch();
        assertEquals(0, result, "Числа должны быть эквивалентны друг другу");
    }

    @Test
    @DisplayName("Сравнение большего числа с меньшим")
    public void testMatchMore() {
        int result = match3.isMatch();
        assertEquals(1, result, "13 должно быть больше 8");
    }

    @Test
    public void testSum() {
        int result = sum1.sum();
        assertEquals(103, result, "65 + 38 должно получиться 103");
    }

    @Test
    @Disabled("тестирование пропуска теста")
    public void testSubsNeg() {
        int result = subs1.subs();
        assertEquals(-6, result, "17 - 23 должно получиться минус 6");
    }

    @Test
    public void testSubs() {
        int result = subs1.subs();
        assertEquals(-6, result, "17 - 23 должно получиться минус 6");
    }

    @Test
    public void testMult() {
        int result = mult1.mult();
        assertEquals(30, result, "15 умножить на 2 должно получиться 30");
    }

    @Test
    public void testDevide() {
        int result = dev1.devide();
        assertEquals(25, result, "50 разделить на 2 должно получиться 25");
    }

    @ParameterizedTest
    @ValueSource(ints = {0, 1})
    public void testFactorial(int n) {
        long result = Factorial.factorial(n);
        assertEquals(1, result, "факториал числа 2 должен дать результат 2");
    }

    @Test
    public void testAreaTriangle() {
        Triangle triangle1 = new Triangle("желтый", "черный", 10, 12, 5);
        float result = triangle1.area();
        assertEquals(17.66352081298828F, result, "площадь треугольника со сторонами 10, 12, 5 должна быть равна 17.66352081298828");
    }
}
