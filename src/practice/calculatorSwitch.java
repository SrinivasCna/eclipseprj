package practice;

import java.util.Scanner;

public class calculatorSwitch {
	public static void main(String[] args) {

		char operator = 0;
		double num1;
		double num2;

		Scanner sc = new Scanner(System.in);
		System.out.println("select the operator: +, -, *, /");
		operator = sc.next().charAt(operator);

		System.out.println("enter a number1");
		num1 = sc.nextDouble();

		System.out.println("enter a number2");
		num2 = sc.nextDouble();

		switch (operator) {
		case '+':
			System.out.println(num1 + num2);
			break;

		case '-':
			System.out.println(num1 - num2);
			break;
		case '*':
			System.out.println(num1 * num2);
			break;
		case '/':
			System.out.println(num1 / num2);
			break;
		default:
			System.out.println("enter a above mentioned operator");
		}

	}
}
