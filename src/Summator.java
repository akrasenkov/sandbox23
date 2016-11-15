public class Summator extends Processor {

    public Summator() {
        this.name = "Summator";
    }

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.sum(b);
    }

}
