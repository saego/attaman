///import.java.io.*

public class ArgRunner {

	public static void main(String[] arg) {
		try {System.setOut(new java.io.PrintStream(System.out, true, "Cp866")); // Нужно чтобы кириллица корректно выводилась в консоль
		} catch (Exception ex) {}
		
		System.out.println("Calculate");
		Calculator calc = new Calculator ();
		double first = Double.parseDouble(arg[0]);
		double second = Double.parseDouble(arg[1]);
		String operand = arg[2];
		
		calc.selectMethod(first,second,operand);
		System.out.println("Result:" +calc.getResult());
		
		//System.out.println("Unicode: " +codeOperand);
		//calc.selectMethod(first,second,operand);
		//System.out.println("Result:" +calc.getResult());
	
		//int temp = e.getKeyCode(operand);
		//Systemut.println("Unicode" +temp);
		
		//calc.operand(oper);
		//calc.add(first,second);
		//calc.(calc.get).(first,second);
		//String opera = calc.get();
		//calc.opera(first,second);
		//System.out.println("Sum:" +calc.getResult());
		//System.out.println("String: " +calc.get());
		//System.out.println(opera);
	} 
}