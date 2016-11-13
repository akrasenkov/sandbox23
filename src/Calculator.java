package com.packageOfProg;

public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor divisor;
    private Processor contractor;

    public Calculator(Processor amplifier, Processor summator, Processor divisor, Processor contractor) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.divisor = divisor;
        this.contractor=contractor;
    }

    public FInteger sum(FInteger a, FInteger b) {
        return summator.process(a, b);
    }

    public FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a, b);
    }

    public FInteger div(FInteger a, FInteger b) {return divisor.process(a, b); }

    public FInteger con(FInteger a, FInteger b){return  contractor.process(a, b);}
}