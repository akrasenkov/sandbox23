public class Main {

    public static void main(String[] args) {
        Main main = new Main();
    }

    public static Calculator calc;

    public Main() {
        par6();
    }

    public void par6(){
        calc = new Calculator(new Summator(), new Amplifier(),
                new Divider(), new Contractor());

        System.out.println(calc.amp(new FInteger(3),
                new FInteger(4)).getValue());

        System.out.println(calc.sum(new FInteger(4),
                new FInteger(12)).getValue());

        System.out.println(calc.div(new FInteger(100),
                new FInteger(25)).getValue());

        System.out.println(calc.con(new FInteger(20),
                new FInteger(6)).getValue());
    }
}
