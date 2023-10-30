import java.util.Scanner;
import java.lang.Math;

public class LoopAsCounter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < 31; i++) {
            System.out.print(" "+i);
        }
        System.out.println("");
        for (int j = 30; j >= 0; j--){
            System.out.print(" "+j);
        }
        System.out.println("");
        for (int v = 0; v <= 18; v = v+3){
            System.out.print(" "+v);
        }
        System.out.println("");
        for (int x = 10; x >= 0; x = x-2) {
            System.out.print(" " + x);
        }
    }
}