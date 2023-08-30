package mypkg;

public class myCalculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public static void main(String[] args) {
        myCalculator myCalc = new myCalculator();
        System.out.println(myCalc.add(1, 2));
        System.out.println(myCalc.subtract(1, 2));
    }
}