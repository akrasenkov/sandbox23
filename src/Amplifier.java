/**
 * Created by 12ё221 on 09.11.2016.
 */
public class Amplifier extends Processor{

    public Amplifier() {
        this.name = "Amplifier";
    }

    @Override
    public FInteger process(FInteger i, FInteger o) {
        return i.amplify(o);
    }

}
