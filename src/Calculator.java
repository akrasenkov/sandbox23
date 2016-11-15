package gov.nasa;

public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor contractor;
    private Processor divider;

    public Calculator(Processor amplifier, Processor summator, Processor divider, Processor contractor) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.contractor = contractor;
        this.divider = divider;
    }

    public Eenteger sum(Eenteger a, Eenteger b){
        return summator.process(a, b);
    }

    public Eenteger mult(Eenteger a, Eenteger b) {
        return amplifier.process(a, b);
    }

    public Eenteger divd(Eenteger a, Eenteger b) {
        return divider.process(a, b);
    }

    public Eenteger contr(Eenteger a, Eenteger b) {
        return contractor.process(a, b);
    }
}
