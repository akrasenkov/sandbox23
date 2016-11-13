public class Calculator {

    protected Processor amplifier;
    protected Processor summator;
    protected Processor divider;
    protected Processor contractor;

    public Calculator(Processor summator, Processor contractor, Processor amplifier, Processor divider) {
        this.summator = summator;
        this.contractor = contractor;
        this.amplifier = amplifier;     
        this.divider = divider;
       
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }

    public  FInteger div(FInteger a, FInteger b){
        return  divider.process(a,b);
    }

    public  FInteger cont(FInteger a, FInteger b){
        return contractor.process(a,b);
    }
}
