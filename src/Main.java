public class Main {

    public static Calculator calc;

    public void init(){
        calc = new Calculator(new Summator(), new Amplifier(), new Divider(), new Contractor());
    }

    public void run() {
        System.out.println(calc.amp(new FInteger(3), new FInteger(4)).getValue());
        System.out.println(calc.sum(new FInteger(4), new FInteger(12)).getValue());
        System.out.println(calc.div(new FInteger(40), new FInteger(5)).getValue());
        System.out.println(calc.cont(new FInteger(54), new FInteger(23)).getValue());
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.init();
        main.run();
    }
}
