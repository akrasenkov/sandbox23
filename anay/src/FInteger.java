import com.sun.media.sound.FFT;

/**
 * Created by 12ё221 on 09.11.2016.
 */
public class FInteger {

    protected int value;

    public FInteger(int value){
        this.value = value;
    }

    public FInteger sum(FInteger b){
       /* int c1 = this.getValue() + b.getValue();
        FInteger c;
        c = new FInteger(c1);
        return c;*/

        return new FInteger((value + b.getValue()));
    }

    public FInteger contract(FInteger b) {
        return new FInteger(value - b.getValue());
    }

    public FInteger divide(FInteger b) {
        return new FInteger(value / b.getValue());
    }
    public FInteger amplify(FInteger b) {
        return new FInteger(value * b.getValue());
    }

    public int getValue() {
        return value;
    }
}
