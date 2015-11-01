	import java.util.Scanner;
	public class ArgRunner{
	public static void main(String[] args){
		try {System.setOut(new java.io.PrintStream(System.out, true, "Cp866")); // Íóæíî ÷òîáû êèðèëëèöà êîððåêòíî âûâîäèëàñü â êîíñîëü
		} catch (Exception ex) {}
		
		Scanner inData = new Scanner(System.in);
		Calculator calc = new Calculator();
		String exit = "no";
		String save = "no";
		double first = 0;
		
		while (!exit.equals("yes")){
			if (!save.equals("yes")){
			
			System.out.print("Fill first data\n");
			first = inData.nextDouble();
			}
			else {
			first = calc.getResult();
			System.out.println("First data\n" +calc.getResult());	
			}
			System.out.print("Fill operator\n");
			String operator = inData.next();
			System.out.print("Fill second data\n");
			double second = inData.nextDouble();
		if (operator.equals("/") && second == 0){
		System.out.println("Division by ZERO!!!");
		System.out.println("Do you want to escape? : yes/no \n");
		exit = inData.next();
		}
		else{
		calc.method(first, operator, second);
		System.out.println("Result:" +calc.getResult());
        System.out.println("Do you want to escape? : yes/no \n");
		exit = inData.next();
		}
        if (!exit.equals("yes")){
        	if(operator.equals("/") && second == 0){
        	System.out.println();
        	}
        	else{
        	System.out.println("Save result? : yes/no \n");
        	save = inData.next();
        	}
		}
		else{
		System.out.println();	
		System.out.println("See you :)");
        }
        }
		}
	}
	
	
	


        
		
	
	

