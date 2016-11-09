public class Calculator {

    private Processor amplifier;
    private Processor summator;

    public Calculator(Processor amplifier, Processor summator) {
        this.amplifier = amplifier;
        this.summator = summator;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }
}
