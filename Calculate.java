public class Calculate{
    public static void main(String[] arg) {
        System.out.println("Hello world...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int summ = first + second;
        int dif = first - second;
        int mult = first * second;
        int div = first / second;
        System.out.println("Sum  " + summ);
        System.out.println("Dif  " + dif);
        System.out.println("Mult  " + mult);
        System.out.println("Div  " + div);
    }
}
