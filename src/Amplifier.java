package gov.nasa;

public class Amplifier extends Processor {

    public Amplifier() {
        this.name = "Amplifier";
    }

    @Override
    public Eenteger process(Eenteger a, Eenteger b) {
        return a.multiply(b);
    }

}
