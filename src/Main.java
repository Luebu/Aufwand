import java.util.Scanner;
import java.lang.System;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aufwand a = new Aufwand();

        System.out.println("Wie oft Ente?");
        double x = System.currentTimeMillis();
        a.ente(sc.nextInt());
        System.out.println(System.currentTimeMillis()-x);
    }
}
