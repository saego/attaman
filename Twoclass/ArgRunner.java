	public class ArgRunner{

	public static void main(String[] arg){
		float first = Float.valueOf(arg[0]);
		float second = Float.valueOf(arg[1]);
		Calculator sum = new Calculator();
		
		double result = sum.summ(first, second);		
		System.out.println("Summ result:" + result);
	}
}