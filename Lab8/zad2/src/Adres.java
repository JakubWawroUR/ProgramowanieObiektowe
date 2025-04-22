public class Adres {
    private String ulica;
    private String numerDomu;
    private String numerMieszkania;
    private String kodPocztowy;
    private String miasto;
    private String kraj;


    public Adres(String ulica, String numerDomu, String numerMieszkania, String kodPocztowy, String miasto, String kraj) throws NieprawidlowyAdresException {
        this.ulica = ulica;
        this.numerDomu = numerDomu;
        this.numerMieszkania = numerMieszkania;
        this.kodPocztowy = kodPocztowy;
        this.miasto = miasto;
        this.kraj = kraj;
        if(ulica == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Ulica nie może być pusta");
        }
        if(numerDomu == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Numer domu nie może być pusty");
        }
        if(numerMieszkania == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Numer mieszkania nie może być pusty");
        }
        if(kodPocztowy == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Kod pocztowy nie może być pusty");
        }
        if(miasto == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Miasto nie może być puste");
        }
        if(kraj == null || ulica.isEmpty()){
            throw new NieprawidlowyAdresException("Kraj nie może być pusty");
        }
    }
    @Override
    public String toString() {
        return String.format("Adres: %s %s/%s, %s %s, %s",
                ulica, numerDomu, numerMieszkania, kodPocztowy, miasto, kraj);
    }
}
