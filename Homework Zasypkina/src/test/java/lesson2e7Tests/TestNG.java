package lesson2e7Tests;

import Lesson_4.ex2.Triangle;
import lesson2e7.Math;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNG {
    Math match1;
    Math match2;
    Math match3;
    Triangle t3;

    @BeforeMethod
    public void setUp() {
        match1 = new Math(20, 20);
        match2 = new Math(3, 5);
        match3 = new Math(13, 8);
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
    public void testMatchEquals() {
        int result = match1.isMatch();
        Assert.assertEquals(result, 0, "Числа эквивалентны друг другу, поэтому результат = '0'");
    }

    @Test
    public void testMatchLess() {
        int result = match2.isMatch();
        Assert.assertEquals(result, -1, "Первое число меньше второго, поэтому результат = '-1'");
    }

    @Test
    public void testMatchMore() {
        int result = match3.isMatch();
        Assert.assertEquals(result, 1, "Первое число больше второго, поэтому результат = '1'");
    }
}
