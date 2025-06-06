package Tasks;

public enum PizzaSize {
    MALA(25, 19.99),    // Mała pizza, 25 cm, 19.99 zł
    SREDNIA(35, 27.50), // Średnia pizza, 35 cm, 27.50 zł
    DUZA(40, 32.99);    // Duża pizza, 40 cm, 32.99 zł

    private final int srednica; // pole średnica (w cm)
    private final double cena;  // pole cena

    PizzaSize(int srednica, double cena) {
        this.srednica = srednica;
        this.cena = cena;
    }

    public int getSrednica() { // metoda getSrednica()
        return srednica;
    }

    public double getCena() { // metoda getCena()
        return cena;
    }
}