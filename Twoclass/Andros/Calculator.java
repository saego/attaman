public class Calculator {

	public double result;
	
	// Select Method: addition, subtraction, multiplication, division, degree.
	public void selectMethod (double first, double second, String operand) {
		if (operand.equals("+")) {
			add(first,second);
		}
		else if (operand.equals("-")) {
			sub(first,second);
		}
		else if (operand.equals("*")) {
			mult(first,second);
		}
		else if (operand.equals("/")) {
			div(first,second);
		}
		else if (operand.equals("^")) {
			deg(first,second);
		}
		else {
			System.out.println("Invalid operation ttt");
		} 
	}
	// method - addition 	
	public void add (double first, double second) {
		result = first + second;
	}
	// method - subtraction
	public void sub (double first, double second) {
		result = first - second;
	}
	// method - multiplication
	public void mult (double first, double second) {
		result = first*second;
	}
	// method - division
	public void div (double first, double second) {
		if (second != 0) {
			result = first / second;	
		}
		else {
			System.out.println("Error division by zero");
		}
	}
	// method - degree
	public void deg (double first, double second) {
		result = Math.pow(first,second);
	}
	// method - Return result
	public double getResult () {
		return result;
	}
}