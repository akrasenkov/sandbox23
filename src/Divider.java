/**
 * Created by 12ё221 on 11.11.2016.
 */
public class Divider extends Processor{
    public Divider(){
        this.name = "Divider"; // Конструктор
    }

    @Override // Аннотация
    public FInteger process(FInteger l, FInteger q) {
        return l.divide(q);
    }
}
