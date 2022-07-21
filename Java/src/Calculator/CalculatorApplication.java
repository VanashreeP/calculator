package Calculator;

import java.util.Scanner;

public class CalculatorApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int number1, number2;	
		int mul;
		int div;
		System.out.println("Number 1: ");
		number1=sc.nextInt();
		
		System.out.println("Number 2: ");
		number2=sc.nextInt();
		
		mul=number1*number2;
		System.out.println("The multiplication of two numbers is "+ mul);
		
		div=number1/number2;
		System.out.println("The division of two numbers is "+ div);


	}

}
