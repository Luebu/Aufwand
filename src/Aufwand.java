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
        System.out.println("An: "+an);
        System.out.println("Ver: "+ver);
        /*System.out.print("Es hat ");
        System.out.print(System.currentTimeMillis() -x);
        System.out.print(" Millisekunden gadauert!");*/
    }

    public void aufgabe3a(int pAnzahl) {
        int an = 1;
        int ver = 0;
        System.out.println(pAnzahl);
        an++;
        an=an+2;
        for (int i = 0; i <= pAnzahl; i++) {
            ver++;
            System.out.println("Das ist super toll wunderbar");
            an++;
            String k = "blavl";
            an=an+2;
        }
        ver++;
        an=an+2;
        for (int i = 0; i <= pAnzahl; i++) {
            ver++;
            System.out.println("Das ist super toll wunderbar");
            an++;
            String k = "blavl";
            an=an+2;
        }
        ver++;
        System.out.println("An: "+an);
        System.out.println("Ver: "+ver);
    }


    public void aufgabe3b(int pAnzahl) {
        System.out.println(pAnzahl);

        for (int i = 0; i <= pAnzahl; i++) {
            System.out.println("Das ist super toll wunderbar");
            String k = "blavl";
            for (int j = 0; j <= pAnzahl; j++) {
                System.out.println("Das ist super toll wunderbar");
                String k2 = "blavl";
            }
        }


    }


    public void aufgabe3c(int[] pZusortieren) {
        int temp;
        for (int i = 1; i < pZusortieren.length; i++) {
            for (int j = 0; j < pZusortieren.length - i; j++) {
                if (pZusortieren[j] > pZusortieren[j + 1]) {
                    temp = pZusortieren[j];
                    pZusortieren[j] = pZusortieren[j + 1];
                    pZusortieren[j + 1] = temp;
                }

            }
        }

    }
}
//Anweisung = n*2+3
//vergeleich = n+1