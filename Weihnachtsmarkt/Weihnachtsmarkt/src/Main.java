package src;

import src.staende.Stand;

import java.util.List;
import java.util.Random;

import static src.zufallsGeneratoren.zufStaende.erzeugeStaende;

public class Main {

    public static void main(String[] args){
        int gesamtEInnahmen = 0;
        Random random = new Random();

        int gluehweinNur;
        int futterNur;
        int verkaufNur;
        int verkaufUndGluehwein;
        int alleDrei;



        for (int tag = 1; tag <= 24; tag++) {
            int besucherAnzahl = 7000 + random.nextInt(3001);

            gluehweinNur = Math.round(besucherAnzahl * (float) 0.30);
            futterNur = Math.round(besucherAnzahl * (float) 0.20);
            verkaufNur = Math.round(besucherAnzahl * (float) 0.10);
            verkaufUndGluehwein = Math.round(besucherAnzahl * (float) 0.25);
            alleDrei = Math.round(besucherAnzahl * (float) 0.15);

            int tagesEinnahmen = berechneEinnahmen(random, gluehweinNur, futterNur, verkaufNur, verkaufUndGluehwein, alleDrei);
            gesamtEInnahmen += tagesEinnahmen;

            gesamtEInnahmen += berechneEinnahmen(random, gluehweinNur, futterNur, verkaufNur, verkaufUndGluehwein, alleDrei);

            List<Stand> weihnachtsmarktStaende = erzeugeStaende();
            for (Stand stand : weihnachtsmarktStaende){

                System.out.println();
                System.out.println("Typ:                " + stand.getClass().getSimpleName());
                System.out.println("Bauart:             " + stand.bauart);
                System.out.println("Größe:              " + stand.groesse + " m²");
                System.out.println("Miete pro Tag:      " + stand.mietkostenProTag() + " €");
                System.out.println("Tageseinnahmen:     " + tagesEinnahmen);

            }
        }
    }

    private static int berechneEinnahmen(Random random, int gluehweinNur, int futterNur, int verkaufNur, int verkaufUndGluehwein, int alleDrei){
        int einnahmen = 0;

        einnahmen += gluehweinNur * (25 + random.nextInt(16));
        einnahmen += futterNur * (20 + random.nextInt(11));
        einnahmen += verkaufNur * (30 + random.nextInt(21));
        einnahmen += verkaufUndGluehwein * ((30 + random.nextInt(21)) + (25 + random.nextInt(16)));
        einnahmen += alleDrei * ((30 + random.nextInt(21)) + (25 + random.nextInt(16)) + (20 + random.nextInt(11)));

        return einnahmen;
    }

}
