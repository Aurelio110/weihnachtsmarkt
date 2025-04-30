package src.staende;

public class Gluehweinstand extends Stand{

    public Gluehweinstand(Bauart bauart, int groesse){
        super(bauart, groesse);
    }

    @Override
    public int mietkostenProTag() {
        return 100 * groesse;
    }

}
