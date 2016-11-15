package gov.nasa;

public class Summator extends Processor {

    public Summator() {
        this.name = "Summator";
    }

    @Override
    public Eenteger process(Eenteger c, Eenteger d) {
        return c.sum(d);
    }

}
