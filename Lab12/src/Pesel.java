import java.util.List;

public class Pesel {
    int numMale = 0;
    int numFemale = 0;
    int yearBirth = 0;
    private Gender gender;
        List<String> Pesele;

    public Pesel(List<String> pesele) {
        this.Pesele = pesele;
    }
    public void wyswietlListe(){
        System.out.println("Wyswietl Liste" +  this.Pesele);
    }

    public void setNumMale(int numMale) {
        this.numMale += 1;
    }

    public void setNumFemale(int numFemale) {
        this.numFemale += 1;
    }

    public String getNumMale() {
        return "Męzczyzn jest: " + numMale;
    }

    public String getNumFemale() {
        return "Kobiet jest: " + numFemale;
    }

    public String getYearBirth() {
        return "W latach";
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth += 1;
    }
}
