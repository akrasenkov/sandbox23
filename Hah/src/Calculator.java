public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor divider;
    private Processor contractor;

    public Calculator(Processor summator, Processor contractor, Processor amplifier, Processor divider) {
        this.summator = summator;
        this.amplifier = amplifier;
        this.divider=divider;
        this.contractor=contractor;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }
    public FInteger div(FInteger a, FInteger b){
        return divider.process(a,b);
    }
    public FInteger con(FInteger a , FInteger b){
        return contractor.process(a,b);
    }
}