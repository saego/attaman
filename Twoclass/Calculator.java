public class Calculator{
	
	private double result;    
    public void add(int first, int second) {
        this.result = first + second;
    }

    public void sub(int first, int second) {
        this.result = first - second;
    }

    public void mul(int first, int second) {
        this.result = first * second;
    }

    public void div(int first, int second) {
    	//if (second != 0){
    	try {	
    	this.result = first / second;
    	}
    	catch(ArithmeticException e){
    	System.out.println("Division by ZERO!");
    	}	
    	//else{throw new RuntimeException("Division by zero");	
    	//}		
    }
    public void exp(int first, int second) {
    this.result = Math.pow(first, second);    
    }
    public double getResult(int first, int second){
    result = this.result;
    return result;
    }
	
    public Calculator(int first, String operator, int second) {
        if (operator.equals("+")) {
        	add(first, second);
            System.out.println(first + " + " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("-")) {
            sub(first, second);
        	System.out.println(first + " - " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("^")) {
            exp(first, second);
        	System.out.println(first + " ^ " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("*")) {
            mul(first, second);
        	System.out.println(first + " * " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("/")) {
            div(first, second);
        	System.out.println(first + " / " + second + " = " + getResult(first,second));
            //return;
        }
        else {
        	System.out.println("Wrong operation");
    }

    }
    }
    

        
    


