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
