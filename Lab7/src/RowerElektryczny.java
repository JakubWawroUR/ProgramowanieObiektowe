public class RowerElektryczny extends Pojazd implements Elektryczny{
    private int poziomNaladowania = 100;
    public RowerElektryczny(String id, String model) {
        super(id, model);
    }

    @Override
    public void naladuj() {
        poziomNaladowania = 100;
    }

    @Override
    public int poziomNaladowania() {
        return poziomNaladowania;
    }

    @Override
    public double obliczKoszt(int liczbaGodzin) {
        return liczbaGodzin*10.0;
    }

}
