public class Divider extends Processor{

    public Divider() {this.name = "Divider";}

    @Override
    public FInteger process( FInteger g, FInteger h) {return g.div(h);}

}
