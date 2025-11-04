package lesson2e7Tests;

import Lesson_4.ex2.Triangle;
import lesson2e7.Match;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
    Match match1;
    Triangle t3;

    @BeforeMethod
    public void setUp() {
        match1 = new Match(20, 20);
    }

    @Test
    public void testSum() {
        int result = match1.sum();
        Assert.assertEquals(result, 40);
    }

    @Test
    public void testAreaTriangle() {
        t3 = new Triangle("серый", "черный", 2, 3, 3);
        float result = t3.area();
        Assert.assertEquals(result, 2.8284270763397217);
    }

    @Test
    public void testMatch() {
        boolean result = match1.isMatch();
        Assert.assertTrue(result, "числа не соответствуют друг другу");
    }
}
