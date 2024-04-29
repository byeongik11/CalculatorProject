package week03.test.step5;

public class Main {
    public static void main(String[] args) {
        Calculator add = new AddOperation();
        add.calculate(1,2);
        System.out.println(add.calculate(1,2));

        Calculator substract = new SubstractOperation();
        substract.calculate(6,3);
        System.out.println(substract.calculate(6,3));

        Calculator multiply = new MultiplyOperation();
        multiply.calculate(10,10);
        System.out.println(multiply.calculate(10,10));

        Calculator divide = new DivideOperation();
        divide.calculate(100,2);
        System.out.println(divide.calculate(100,2));
    }
}
