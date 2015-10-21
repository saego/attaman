public class Calculate{
    public static void main(String[] arg) {
        System.out.println("Calculating result...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int summ = first + second;
        int dif = first - second;
        int mult = first * second;
        float div = first / second;
        System.out.println("Sum  " + first + " + " + second + " = " + summ);
        System.out.println("Dif  " + first + " - " + second + " = " + dif);
        System.out.println("Mult " + first + " * " + second + " = " + mult);
        System.out.println("Div  " + first + " / " + second + " = " + div);
    }
}
