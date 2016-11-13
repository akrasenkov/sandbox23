public class Division extends Processor{

    public Division() {this.name = "Division";}

    @Override
    public FInteger process(FInteger a, FInteger b) {
        return a.divide(b);
    }
}