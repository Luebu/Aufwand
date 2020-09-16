import java.util.Scanner;
import java.util.Date;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Aufwand a = new Aufwand();
        Date d = new Date();

        System.out.println("Wie oft Ente?");
        double x = d.getTime();
        a.ente(sc.nextInt());
        System.out.println(x-d.getTime());
    }
}
