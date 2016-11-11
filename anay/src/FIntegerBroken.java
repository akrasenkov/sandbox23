/**
 * Created by 12ё221 on 09.11.2016.
 */
public class FIntegerBroken extends FInteger {

    public FIntegerBroken(int value) {
        super(value);
    }

    @Override
    public FInteger sum(FInteger b) {
        return
                new FInteger(value + b.getValue() + 500);
    }

}
