package src.staende;

public class Verkaufsstand extends Stand{

    public Verkaufsstand(Bauart bauart, int groesse) {
        super(bauart, groesse);
    }

    @Override
    public int mietkostenProTag() {
        return 65 * groesse;
    }

    @Override
    public boolean erfuelltAuflagen() {
        return true;
    }



}
