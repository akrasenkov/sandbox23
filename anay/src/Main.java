public class Main {

    private static Calculator calc;
 public Main(){
     calc = new Calculator(
             new Summator(),
             new Amplifier(),
             new Divider(),
             new Contractor()
     );
      }
    public static void main(String[] args) {
        Main main = new Main();
        System.out.println(calc.amp(
                new FInteger(8),
                new FInteger(2)
        ).getValue());
        System.out.println(calc.sum(
                new FInteger(34),
                new FInteger(18)
        ).getValue());
        System.out.println(calc.div(
                new FInteger(32),
                new FInteger(8)
        ).getValue());
        System.out.println(calc.con(
                new FInteger(18),
                new FInteger(9)
        ).getValue());
    }
}