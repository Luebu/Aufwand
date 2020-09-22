import java.lang.System;

public class Aufwand {

    public void ente(int pX) {
        int an = 3;
        int ver = 0;
        //double x = System.currentTimeMillis();
        for (int i = 0; i < pX; i++) {

            ver++;
            System.out.println("Ente");
            an++;
            an++;
        }
        ver++;
        System.out.println(an);
        System.out.println(ver);
        /*System.out.print("Es hat ");
        System.out.print(System.currentTimeMillis() -x);
        System.out.print(" Millisekunden gadauert!");*/
    }
}
//Anweisung = n*2+3
//vergeleich = n+1