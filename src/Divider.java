public class Divider extends Processor {

    public Divider() {
        this.name = "Devider";
    }

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.divide(b);
    }
}
