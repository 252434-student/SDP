package assignment5;

public class CalculatorContext {
    private CalculatorStrategy calculatorStrategy;
    public CalculatorContext(CalculatorStrategy strategy){
        this.calculatorStrategy = strategy;
    }
    public void setCalculatorStrategy(CalculatorStrategy strategy){
        this.calculatorStrategy = strategy;
    }
    public void performCalculation(int a, int b){
        calculatorStrategy.calculate(a,b);
    }
}
