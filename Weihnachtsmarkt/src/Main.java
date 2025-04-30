package src;

import src.staende.Stand;

import java.util.List;

import static src.zufallsGeneratoren.zufStaende.erzeugeStaende;

public class Main {

    public static void main(String[] args){

        List<Stand> weihnachtsmarktStaende = erzeugeStaende();
        for (Stand stand : weihnachtsmarktStaende){
            System.out.println();
            System.out.println("Typ:           " + stand.getClass().getSimpleName());
            System.out.println("Bauart:        " + stand.bauart);
            System.out.println("Größe:         " + stand.groesse + " m²");
            System.out.println("Miete pro Tag: " + stand.mietkostenProTag() + " €");
            System.out.println();
        }

    }

}
