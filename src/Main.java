public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        Main main = new Main();
    }

    public Main(){
        init();
    }
    public void init(){
        calc = new Calculator(
                new Summator(),
                new Contractor(),
                new Amplifier(),
                new Divider()
        );


        System.out.println(calc.sum(
                new FInteger (3), new FInteger(5)).getValue());
        System.out.println(calc.con(
                new FInteger (2), new FInteger(3)).getValue());
        System.out.println(calc.amp( new
                FInteger (12), new FInteger(3)).getValue());
        System.out.println(calc.div( new FInteger (6), new FInteger(5)).getValue());
    }
}
