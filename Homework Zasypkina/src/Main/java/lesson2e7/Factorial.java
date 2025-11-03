package lesson2e7;

//Напишите программу, позволяющую вычислить факториал числа;
public class Factorial {

    public static long factorial(int n) {
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    static void main() {
        System.out.println(factorial(20));
    }
}
