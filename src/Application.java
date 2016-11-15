package gov.nasa;


public class Application
{
    public static void main(String[] args)
    {
        //System.out.println("Hello, world");
        Application app = new Application();
        //app.printString();
    }
    public Application()
    {
        printString();
        //конструктор
    }
    public void printString()
    {
        System.out.println("Hello, world 2");
        Eenteger a = new BrokenEenteger(3);
        Eenteger b = new Eenteger(4);
        Eenteger c = a.sum(b); /* т.к. вызывается метод sum() из a = BrokenEenteger, то результат будет "сломаным"*/

        /* что, по сути, то же самое, что и:
        Integer a1 = new Integer(3);
        Integer b1 = new Integer(4);
        integer c1 = a1 + b1;*/

        System.out.println(c.getValue());
    }

}
