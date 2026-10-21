package assignment5;

public class SubtractStrategy implements CalculatorStrategy{
    @Override
    public void calculate(int a, int b) {
        System.out.println(a+" - "+b+" = "+(a-b));
    }
}
