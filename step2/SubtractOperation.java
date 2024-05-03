package week03.test.step5;

public class SubstractOperation implements Calculator{
    @Override
    public double calculate(int firstNumber, int secondNumber) {
        return firstNumber-secondNumber;
    }
}
