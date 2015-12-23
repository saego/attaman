import java.util.Scanner;
public class Test{
	public static void main(String args[]){
		Scanner date = new Scanner(System.in);
		System.out.println("Fill m");
		int m = date.nextInt();
		System.out.println("Fill n");
		int n = date.nextInt();
		m = operation(m);
		n = operation(n);
		System.out.println();
		System.out.println(m);
		System.out.println(n);
	}
	public static int operation(int r){
	r = r * 2;
	return r;
	}
}