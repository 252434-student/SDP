import assignment5.*;

public class Main {
    public void main(String[] args){
        CalculatorContext calculatorContext = new CalculatorContext(new AddStrategy());
        calculatorContext.performCalculation(11, 39);

        calculatorContext.setCalculatorStrategy(new SubtractStrategy());
        calculatorContext.performCalculation(0, 65);

        calculatorContext.setCalculatorStrategy(new MultiplyStrategy());
        calculatorContext.performCalculation(-4, -91);

        calculatorContext.setCalculatorStrategy(new DivideStrategy());
        calculatorContext.performCalculation(45, 5);
        calculatorContext.performCalculation(5,2);
    }
}
