public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor divider;
    private Processor contract;

    public Calculator(Processor amplifier, Processor summator, Processor divider, Processor contract) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.divider = divider;
        this.contract = contract;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }

    public FInteger div(FInteger a, FInteger b) {return divider.process(a, b);}

    public FInteger con(FInteger a, FInteger b) {return divider.process(a, b);}
}
