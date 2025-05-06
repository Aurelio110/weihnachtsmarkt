package src.staende;

public abstract class Stand{
    public Bauart bauart;
    public int groesse;

    public Stand(Bauart bauart, int groesse){
        this.bauart = bauart;
        this.groesse = groesse;
    }

    public abstract int mietkostenProTag();

    public abstract boolean erfuelltAuflagen();

}
