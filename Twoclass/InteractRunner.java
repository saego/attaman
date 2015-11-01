public class InteractRunner{

	public static void main(String[] arg){
		Calculator calc = new Calculator();
		double first = Double.valueOf(arg[0]);
		double second = Double.valueOf(arg[2]);
		String operator = arg[1]; 
		if (operator.equals("/") && second == 0){
		System.out.println("Division by ZERO!!!");
		}
		else{
		calc.method(first, operator, second);
		double result = calc.getResult();		
		System.out.println("Result:" + result);
	}
}
}