public class FInteger
{

    protected int value;

    public FInteger(int value)
    {
        this.value=value;
    }
    public FInteger sum( FInteger b)
    {
        return  new FInteger(value+ b.getValue());
    }

    public FInteger cont( FInteger b)
    {
        return  new FInteger(value- b.getValue());
    }

    public FInteger div(FInteger b)
    {
        return new FInteger(value / b.getValue());
    }

    public FInteger amp(FInteger b)
    {
        return  new FInteger(value* b.getValue());
    }
    public int getValue()
    {
        return value;
    }
}
