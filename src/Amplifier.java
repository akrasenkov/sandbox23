public class Amplifier extends Processor {

    public Amplifier() {
        this.name = "Amplifier";
    }

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.amplify(b);
    }

}