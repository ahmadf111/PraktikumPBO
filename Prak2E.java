import java.util.Scanner;

public class Prak2E {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        double a, t, l;
        a = input.nextDouble();
        t = input.nextDouble();
        l = a * t / 2;

        System.out.printf("%.2f", l);
    }
}