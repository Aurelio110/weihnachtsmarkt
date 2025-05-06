package src.zufallsGeneratoren;
import src.staende.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class zufStaende {
    private static final Random random = new Random();

    private static Bauart zufBauart(){
        Bauart bauart;
        if (random.nextBoolean()){
            bauart = Bauart.offen;
        } else {
            bauart = Bauart.umbaut;
        }
        return bauart;
    }

    private static int zufGroesse(Bauart bauart){
        if (bauart.equals(Bauart.offen)){
            return 15 + random.nextInt(16);
        } else {
            return 35 + random.nextInt(66);
        }
    }

    private static Stand erzeugeStand(String standArt){
        Bauart bauart = zufBauart();
        int groesse = zufGroesse(bauart);

        switch (standArt){
            case "gluehwein":
                return new Gluehweinstand(bauart, groesse);
            case "futter":
                return new Futterstand(bauart, groesse);
            case "verkauf":
                return new Verkaufsstand(bauart, groesse);
            default:
                throw new IllegalArgumentException("Unbekannter Standtyp: " + standArt);
        }
    }

    public static List<Stand> erzeugeStaende(){
        int anzahlStaende;
        anzahlStaende = 70 + random.nextInt(31);
        int anzahlGluehwein;
        anzahlGluehwein = (int) (anzahlStaende * 0.1);
        int anzahlFutter;
        anzahlFutter = (int) (anzahlStaende * 0.3);
        int anzahlVerkauf;
        anzahlVerkauf = anzahlStaende - anzahlGluehwein - anzahlFutter;

        List<Stand> staende = new ArrayList<>();
        for(int i = 0; i < anzahlGluehwein; i++){
            staende.add(erzeugeStand("gluehwein"));
        }
        for(int i = 0; i < anzahlFutter; i++){
            staende.add(erzeugeStand("futter"));
        }
        for(int i = 0; i < anzahlVerkauf; i++){
            staende.add(erzeugeStand("verkauf"));
        }
        return staende;
    }
}
