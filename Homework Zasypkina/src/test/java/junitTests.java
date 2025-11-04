import Lesson_4.ex2.Triangle;
import lesson2e7.Factorial;
import lesson2e7.Match;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class junitTests {
    @Test
    @DisplayName("Сравнение целых чисел")
    public void testMatch() {
        Match match = new Match(7, 8);
        boolean result = match.isMatch();
        assertFalse(result, "7 должно быть не равно 8");
    }

    @Test
    public void testSum() {
        Match sum1 = new Match(65, 38);
        int result = sum1.sum();
        assertEquals(103, result, "65 + 38 должно получиться 103");
    }

    @Test
    @Disabled("тестирование пропуска теста")
    public void testSubsNeg() {
        Match subs1 = new Match(17, 23);
        int result = subs1.subs();
        assertEquals(-6, result, "17 - 23 должно получиться минус 6");
    }

    @Test
    public void testSubs() {
        Match subs1 = new Match(17, 23);
        int result = subs1.subs();
        assertEquals(-6, result, "17 - 23 должно получиться минус 6");
    }

    @Test
    public void testMult() {
        Match mult1 = new Match(15, 2);
        int result = mult1.mult();
        assertEquals(30, result, "15 умножить на 2 должно получиться 30");
    }

    @Test
    public void testDevide() {
        Match dev1 = new Match(50, 2);
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
