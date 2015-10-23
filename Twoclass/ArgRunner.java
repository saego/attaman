	import java.util.Scanner;
	public class ArgRunner{
	public static void main(String[] arg){
		//float first = Float.valueOf(arg[0]);
		//float second = Float.valueOf(arg[1]);
		Scanner in = new Scanner (System.in);
		System.out.print("Fill first data\n");
		float first = in.nextFloat();
		System.out.print("Fill second data\n");
		float second = in.nextFloat();
		Calculator sum = new Calculator();
		
		double result = sum.summ(first, second);		
		System.out.println("Summ result:" + result);
	}
}