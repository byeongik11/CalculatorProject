package test.step5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator add = new AddOperation();
        Calculator subtract = new SubtractOperation();
        Calculator multiply = new MultiplyOperation();
        Calculator divide = new DivideOperation();

        System.out.println("첫 번째 숫자를 입력하세요:");
        double num1 = scanner.nextDouble();

        System.out.println("두 번째 숫자를 입력하세요:");
        double num2 = scanner.nextDouble();


        System.out.println("원하는 연산을 선택하세요:");
        System.out.println("1. 더하기");
        System.out.println("2. 빼기");
        System.out.println("3. 곱하기");
        System.out.println("4. 나누기");
        int choice = scanner.nextInt();

        double result = 0;
        switch (choice) {
            case 1:
                result = add.calculate((int)num1, (int)num2);
                break;
            case 2:
                result = subtract.calculate((int)num1, (int)num2);
                break;
            case 3:
                result = multiply.calculate((int)num1, (int)num2);
                break;
            case 4:
                result = divide.calculate((int)num1,(int)num2);
                break;
            default:
                System.out.println("잘못된 선택입니다.");
                return;
        }

        System.out.println("결과: " + result);

    }
}
