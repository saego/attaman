public class Calculate{
    public static void main(String[] arg) {
        System.out.println("Calculating result...");
        float first = Float.valueOf(arg[0]);
        float second = Float.valueOf(arg[1]);
        float third = Float.valueOf(arg[2]);
        float summ = first + second + third;
        float dif = first - second;
        float mult = first * second;
        float div = first / second;
        double pow = Math.pow(first, second);
        System.out.println("Sum  " + first + " + " + second + " + " + third + " = " + summ);
        System.out.println("Dif  " + first + " - " + second + " = " + dif);
        System.out.println("Mult " + first + " * " + second + " = " + mult);
        System.out.println("Div  " + first + " / " + second + " = " + div);
        System.out.println("Pow  " + first + " ^ " + second + " = " + pow);
    }
}
