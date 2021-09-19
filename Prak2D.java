import java.util.Scanner;

public class Prak2D {
    public static void main (String[] args){
        Scanner BanyakBebek = new Scanner (System.in);
        int a, b;
        a = BanyakBebek.nextInt();
        b = BanyakBebek.nextInt();
        
        System.out.println("Masing-masing " + a/b);
        System.out.println("Bersisa " + a % b);
    }

}