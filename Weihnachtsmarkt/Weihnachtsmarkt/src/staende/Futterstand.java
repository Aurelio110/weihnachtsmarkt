package src.staende;

public class Futterstand extends Stand{

    public Futterstand(Bauart bauart, int groesse){
        super(bauart, groesse);
    }

    @Override
    public int mietkostenProTag() {
        return 75 * groesse;
    }

    @Override
    public boolean erfuelltAuflagen() {
        return true;
    }

}
