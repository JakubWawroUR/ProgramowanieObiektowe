package Biologia;

public class Gatunek {
    String nazwaRodzaju,nazwaGatunku,opis;
    int liczbaChromosomow2n,podstawowaLiczbaChromosomowX;

    public Gatunek(String nazwaRodzaju, String nazwaGatunku, String opis, int liczbaChromosomow2n, int podstawowaLiczbaChromosomowX) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.opis = opis;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomowX = podstawowaLiczbaChromosomowX;
    }
    public  void pelnaNazwa(){
        System.out.println("Nazwa rodzaju: " + nazwaRodzaju + "\nNazwa gatunku: " + nazwaGatunku);
    }
    public  void haploidlnaLiczbaChromosomowN(){
        System.out.println("Haploidalna liczba chromosomów wynosi: " +  liczbaChromosomow2n/2);
    }
    public  void wszystkieDane(){
        System.out.println("nazwa rodzaju: "  + nazwaRodzaju);
        System.out.println("nazwa gatunku: " + nazwaGatunku);
        System.out.println("opis: " + opis);
        System.out.println("liczba chromosomów 2n: " + liczbaChromosomow2n);
        System.out.println("podstawowa liczba chromosomow x: " + podstawowaLiczbaChromosomowX);
    }

}
