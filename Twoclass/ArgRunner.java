	import java.util.Scanner;
	public class ArgRunner{
	public static void main(String[] arg){
		//float first = Float.valueOf(arg[0]);
		//float second = Float.valueOf(arg[1]);
		Scanner inData = new Scanner (System.in);
		System.out.print("Fill first data\n");
		float first = inData.nextFloat();
		System.out.print("Fill second data\n");
		float second = inData.nextFloat();
		Calculator sum = new Calculator();
		
		double result = sum.summ(first, second);		
		System.out.println("Summ result:" + result);
	}
}