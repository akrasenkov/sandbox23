public class Main {

    public Main(){
        Calculator calc;

        calc = new Calculator(new Summator(), new Amplifier(), new Divider(), new Contractor());
        System.out.println(calc.sum(new FInteger(4),new FInteger(12)).getValue());
        System.out.println(calc.cont(new FInteger(7),new FInteger(5)).getValue());
        System.out.println(calc.amp(new FInteger(3),new FInteger(4)).getValue());
        System.out.println(calc.div(new FInteger(40),new FInteger(10)).getValue());
    }
    public static void main(String[] args) {
        Main main = new Main();
    }
}
