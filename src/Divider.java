public class Divider extends Processor {

    public Divider() {
        this.name = "Divider";
    }

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.div(b);
    }

}
