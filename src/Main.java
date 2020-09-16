import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aufwand a = new Aufwand();
        System.out.println("Wie oft Ente?");
        a.ente(sc.nextInt());
    }
}
