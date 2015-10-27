public class Calculator{
	//String exit = "no";
	//while (!exit.equals("yes")){
	private double result;
    //while (!exit.equals("yes")){
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
    	if (second !=0){
    	this.result = first / second;
    	}
    	else{
    	System.out.println("Error!!!Devide by 0\n");
    	//this.result = "Error";
    	}
    }
    public void exp(double first, double second) {
    this.result = Math.pow(first, second);    
    }
    public double getResult(double first, double second){
    result = this.result;
    return result;
    }
	
    public Calculator(double first, String operator, double second) {
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
    