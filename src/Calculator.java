/**
 * Created by Павел on 09.11.2016.
 */
public class Calculator {

    private Processor amplifier;
    private Processor summator;
    private Processor divider;
    private Processor contracter;

    public Calculator(Processor amplifier, Processor summator, Processor divider, Processor contracter) {
        this.amplifier = amplifier;
        this.summator = summator;
        this.divider = divider;
        this.contracter = contracter;
    }
    public  FInteger sum(FInteger a, FInteger b) {
        return summator.process(a,b);
    }
    public  FInteger amp(FInteger a, FInteger b) {
        return amplifier.process(a,b);
    }
    public  FInteger div(FInteger a, FInteger b) {
        return divider.process(a,b);
    }
    public  FInteger con(FInteger a, FInteger b) {
        return contracter.process(a,b);
    }
}