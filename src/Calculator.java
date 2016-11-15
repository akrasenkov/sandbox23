public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor contract;
    private Processor divide;

    public Calculator(Processor amplifier, Processor summator, Processor contract, Processor divide) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.contract = contract;
        this.divide = divide;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }

    public FInteger cot(FInteger a, FInteger b) { return contract.process(a,b);}
    public FInteger div(FInteger a, FInteger b) { return divide.process(a,b);}
}
