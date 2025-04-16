package lab7.task1.services;

import lab7.task1.interfaces.FactorialCalculator;

import java.util.HashMap;
import java.util.Map;

public class FactorialCalculatorProxy implements FactorialCalculator {
    private RealFactorialCalculator realCalculator;
    private Map<Integer, Long> cache;

    public FactorialCalculatorProxy() {
        this.realCalculator = new RealFactorialCalculator();
        this.cache = new HashMap<>();
    }

    @Override
    public long calculateFactorial(int n) {
        if (cache.containsKey(n)) {
            System.out.println("Извлечение из кэша: " + n + "! = " + cache.get(n));
            return cache.get(n);
        }

        long result = realCalculator.calculateFactorial(n);
        cache.put(n, result);
        System.out.println("Вычисление и сохранение в кэш: " + n + "! = " + result);
        return result;
    }

    public void clearCache() {
        cache.clear();
        System.out.println("Кэш очищен");
    }
}