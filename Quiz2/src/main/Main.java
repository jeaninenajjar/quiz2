package main;

import java.util.Scanner;

import org.apache.poi.ss.formula.functions.FinanceLib;

@SuppressWarnings("unused")
public class Main {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
  /**tried encapsulating, said illegal modifier? */
		
		System.out.print("Enter initial tuition cost ");
		double initialTuition = input.nextDouble();
		System.out.print("Enter percentage increase for tuition % ");
		double percentage = input.nextDouble();
		System.out.print("Enter repayment APR % ");
		double repaymentPercentage = input.nextDouble();
		System.out.print("Enter term");
		double term = input.nextDouble();
		

	    double calc = 0;
		double tuition = 0;
	        for (int i = 0; i < 4; i++) {
			calc = Math.pow(((percentage * .01) + 1), i) * initialTuition;
			tuition = tuition += calc;
		                                    }
		System.out.println(tuition);
		
		/** tried using financelib PMT for amortization but couldn't figure it out */
		
		
		double rate= repaymentPercentage/1200.0;
		double amortization = tuition * rate/
				(1 -1/Math.pow(1+ rate,term*12));
		
		System.out.printf("%6.3f",amortization);
		
		
	}
}
