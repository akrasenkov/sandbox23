/**
 * Created by 12ё221 on 09.11.2016.
 */
public abstract class Processor {

    public String name;

    public abstract FInteger process(FInteger a, FInteger b);

    public String getName() {
        return name; //Processor.class.getSimpleName();
    }

}
