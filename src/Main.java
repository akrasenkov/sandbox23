public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        calc = new Calculator( new Amplifier(),new Summator(), new Contractor(), new Divider());
        System.out.println(calc.amp(new FInteger(3), new FInteger(4)).getValue());
        System.out.println(calc.sum(new FInteger(4), new FInteger(12)).getValue());
        System.out.println(calc.con(new FInteger(17), new FInteger(5)).getValue());
        System.out.println(calc.div(new FInteger(21), new FInteger(7)).getValue());
    }

}
