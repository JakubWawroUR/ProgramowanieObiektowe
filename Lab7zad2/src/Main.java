class main
{
    public static void main(String[] arg)
    {

        Prostokat maly_punkt = new Prostokat(3, 6, "czerwony");
        Trojkat rownoboczny = new Trojkat(7, 4, "bia�y");
        System.out.println(maly_punkt.opis());
        //maly_punkt.zwieksz(3,4);
        IFigury[] figury = new IFigury[4];
        figury[0] = new Prostokat(5, 3, "czerwony");
        figury[1] = new Trojkat(4, 6, "niebieski");
        figury[2] = new Kwadrat(5, "zielony");
        figury[3] = new Prostokat(2, 7, "żółty");
        Figura[] tablicaFigur = new Figura[10];
        tablicaFigur[0] = new Prostokat(3, 6, "czerwony");
        tablicaFigur[1] = new Trojkat(7, 4, "biały");
        tablicaFigur[2] = new Prostokat(5, 8, "niebieski");
        tablicaFigur[3] = new Trojkat(10, 5, "zielony");
        tablicaFigur[4] = new Prostokat(2, 9, "żółty");
        tablicaFigur[5] = new Trojkat(6, 3, "czarny");
        tablicaFigur[6] = new Prostokat(7, 7, "fioletowy");
        tablicaFigur[7] = new Trojkat(4, 8, "pomarańczowy");
        tablicaFigur[8] = new Prostokat(1, 10, "szary");
        tablicaFigur[9] = new Trojkat(9, 2, "różowy");
        float skala = 1.5f;
        for (Figura figura : tablicaFigur) {
            figura.skaluj(skala);
        }
        for (Figura figura : tablicaFigur) {
            System.out.println(figura.opis());
        }

    }
}