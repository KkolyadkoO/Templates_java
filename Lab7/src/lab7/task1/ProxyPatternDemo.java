package lab7.task1;

import lab7.task1.services.FactorialCalculatorProxy;

public class ProxyPatternDemo {
    public static void main(String[] args) {
        FactorialCalculatorProxy proxy = new FactorialCalculatorProxy();

        System.out.println("5! = " + proxy.calculateFactorial(5));

        System.out.println("5! = " + proxy.calculateFactorial(5));

        System.out.println("7! = " + proxy.calculateFactorial(7));

        proxy.clearCache();

        System.out.println("5! = " + proxy.calculateFactorial(5));
    }
}
