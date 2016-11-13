public class Constractor extends Processor {

    public Constractor() {
        this.name = "Constractor";
    }

    @Override
    public FInteger process(FInteger e, FInteger f) {
        return e.contract(f);
    }
}
