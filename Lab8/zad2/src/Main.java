public class Main {
    public static void main(String[] args) {
        try {
            Adres adres = new Adres("Sienkiewicza", "", "12",
                    "00-001", "Warszawa", "Polska");
            System.out.println(adres);
        }catch (NieprawidlowyAdresException ex){
            System.err.println("Bład:" + ex.getMessage());
        }
    }
}