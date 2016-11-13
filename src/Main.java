public class Main {

    public static Calculator calc;

    public static void main(String[] args) {
        calc = new Calculator(
                new Amplifier(),
                new Summator(),
                new Divider(),
                new Contractor()
        );
        System.out.println("Умножение "+calc.amp(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println("Сумма "+calc.sum(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println("Деление "+calc.div(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
        System.out.println("Вычитание "+calc.con(
                new FInteger(3),
                new FInteger(4)
        ).getValue());
    }

}
