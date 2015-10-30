public class Calculator{
	
	public double result;    
	 public void method(double first, String operator, double second) {
        if (operator.equals("+")) {
        	add(first, second);
            //System.out.println(first + " + " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("-")) {
            sub(first, second);
        	//System.out.println(first + " - " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("^")) {
            exp(first, second);
        	//System.out.println(first + " ^ " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("*")) {
            mul(first, second);
        	//System.out.println(first + " * " + second + " = " + getResult(first,second));
            //return;
        }
        else if (operator.equals("/")) {
            div(first, second);
        	//System.out.println(first + " / " + second + " = " + getResult(first,second));
            //return;
        }
        else {
        	System.out.println("Wrong operation");
    }

    }
    public void add(double first, double second) {
        this.result = first + second;
    }

    public void sub(double first, double second) {
        this.result = first - second;
    }

    public void mul(double first, double second) {
        this.result = first * second;
    }

    public void div(double first, double second) {
    	//if (second != 0){
    	//try {	
    	this.result = first / second;
    	//}
    	//catch(ArithmeticException e){
    	//System.out.println("Division by ZERO!");
    	//}	
    	//else{throw new RuntimeException("Division by zero");	
    	//}		
    }
    public void exp(double first, double second) {
    this.result = Math.pow(first, second);    
    }
    public void clear(){
    this.result = 0;
    }
    public double getResult(){
    //result = this.result;
    return result;
    }
	
   
    }
    

        
    


