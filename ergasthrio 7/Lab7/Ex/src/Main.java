//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {

        SystimaDieythynsis sd = new SystimaDieythynsis();
        Mihani m = new Mihani(1500, 100);
        Vehicle v = new Vehicle("Νίκος Παπαδόπουλος", "ΑΒΕ1234", 2020, sd, m);

        v.sysdief.vazeiEmpros();
        v.eng.leitourgia();
    }
}