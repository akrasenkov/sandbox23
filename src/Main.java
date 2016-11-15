public class Main {

    public static Calculator calc;

    public void init() {
        calc = new Calculator(new Amplifier(), new Summator(), new Divider(), new Contractor());
        System.out.println(calc.amp(new FInteger(10), new FInteger(15)).getValue());
        System.out.println(calc.sum(new FInteger(2), new FInteger(6)).getValue());
        System.out.println(calc.div(new FInteger(81), new FInteger(9)).getValue());
        System.out.println(calc.con(new FInteger(9), new FInteger(2)).getValue());
    }

    public static void main(String[] args){
        Main main = new Main();
        main.init();
    }
}
