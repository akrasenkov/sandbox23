package gov.nasa;

public class Divider extends Processor{

    public Divider() {
        this.name = "Divider";
    }

    @Override
    public Eenteger process(Eenteger a, Eenteger b){return a.divide(b);}
}
