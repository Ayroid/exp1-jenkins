package mypkg;

public class MyCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public static void main(String[] args) {
        MyCalculator myCalc = new MyCalculator();
        System.out.println(myCalc.add(1, 2));
        System.out.println(myCalc.subtract(1, 2));
        System.out.println(MyCalculator.multiply(1, 2));
        System.out.println(MyCalculator.divide(1, 2));
    }
}