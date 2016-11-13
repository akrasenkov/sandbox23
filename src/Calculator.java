public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor contractor;
    private Processor devider;

    public Calculator(Processor amplifier, Processor summator, Processor contractor, Processor devider) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.contractor = contractor;
        this.devider = devider;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }

    public FInteger contract(FInteger a, FInteger b) {return  contractor.process(a, b);}

    public FInteger divide(FInteger a, FInteger b) {return devider.process(a, b);}
}
