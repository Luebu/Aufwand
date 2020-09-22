import java.lang.System;
public class Aufwand {
    public void ente(int pX){
        double x = System.currentTimeMillis();
        for(int i = 0;i<pX;i++){
            System.out.println("Ente");
        }
        System.out.print("Es hat ");
        System.out.print(System.currentTimeMillis() -x);
        System.out.print(" Millisekunden gadauert!");
    }
}
