package lab7.task1.services;

import lab7.task1.interfaces.FactorialCalculator;

public class RealFactorialCalculator implements FactorialCalculator {
    @Override
    public long calculateFactorial(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Факториал отрицательного числа не определен");
        }

        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}