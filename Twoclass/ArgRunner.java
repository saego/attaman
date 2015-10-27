	import java.util.Scanner;
	public class ArgRunner{
	public static void main(String[] args){
		try {System.setOut(new java.io.PrintStream(System.out, true, "Cp866")); // Нужно чтобы кириллица корректно выводилась в консоль
		} catch (Exception ex) {}
		//float first = Float.valueOf(arg[0]);
		//float second = Float.valueOf(arg[2]);
		//String operator = String.valueOf(arg[1]);
		Scanner inData = new Scanner (System.in);
		String exit = "no";
		while (!exit.equals("yes")){
			System.out.print("Fill first data\n");
			double first = inData.nextDouble();
			System.out.print("Fill operator\n");
			String operator = inData.next();
			System.out.print("Fill second data\n");
			double second = inData.nextDouble();
		
        new Calculator(first, operator, second);
        System.out.print("Do you want to escape: yes/no \n");
		exit = inData.next();
        
        }
		
	}
	}
	