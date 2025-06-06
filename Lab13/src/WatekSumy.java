public class WatekSumy extends Thread {
    private int liczbaN;
    private long wynikSumy;

    public WatekSumy(int liczbaN) {
        this.liczbaN = liczbaN;
        this.wynikSumy = 0;
    }

    @Override
    public void run() {
        System.out.println("Obliczam sumę od 1 do " + liczbaN);
        for (int i = 1; i <= liczbaN; i++) {
            wynikSumy += i;
        }
        System.out.println("Suma = " + wynikSumy);
    }

    public long getWynikSumy() {
        return wynikSumy;
    }
}