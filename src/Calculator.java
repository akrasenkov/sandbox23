public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor contractor;
    private Processor divider;

    public Calculator(Processor amplifier, Processor summator, Processor contractor, Processor divider) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.contractor = contractor;
        this.divider = divider;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }

    public FInteger con(FInteger a, FInteger b) { return contractor.process(a, b);}

    public FInteger div(FInteger a, FInteger b) { return divider.process(a, b);}
}
