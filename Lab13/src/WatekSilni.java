import java.math.BigInteger;

public class WatekSilni extends Thread {
    private int liczbaN;
    private BigInteger wynikSilni;

    public WatekSilni(int liczbaN) {
        this.liczbaN = liczbaN;
        this.wynikSilni = BigInteger.ONE;
    }

    @Override
    public void run() {
        System.out.println("Obliczam silnię z " + liczbaN);
        for (int i = 1; i <= liczbaN; i++) {
            wynikSilni = wynikSilni.multiply(BigInteger.valueOf(i));
        }
        System.out.println("Silnia = " + wynikSilni);
    }

    public BigInteger getWynikSilni() {
        return wynikSilni;
    }
}