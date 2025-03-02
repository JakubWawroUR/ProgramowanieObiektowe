package Tasks;



public class Tasks {
    public static String RownanieKwadratowe(double a,double b,double c){

        double delta = b*b  - 4*a*c;
        if(delta==0){
            double x0 = (-b)/(2*a);
            return "Rozwiązaniem równania kwadratowego jest:" + x0;
        }else if(delta>0){
            double x1 = (-b-Math.sqrt(delta))/(2*a);
            double x2 = (-b+Math.sqrt(delta))/(2*a);
            return "Rozwiązaniem równania kwadratowego są:" + x1 + " " + x2;
        }else{
            return "delta mniejsza od 0 brak rozwiązań";
        }
    }
    public static String  WyznaczanieWartosciFunkcji(int x){
        int a;
        int b;
        int c;
        if(x>0){
            a = 2*x;
        }else if(x==0){
            a = 0;
        }else{
            a= -3*x;
        }
        if(x>=1){
            b = x*x;
        }else{
            b = x;
        }
        if(x>2){
            c = 2+x;
        }else if(x==2){
            c = 8;
        }else{
            c = x-4;
        }
        return "Funkcje przyjmują wartosci:\n" + "a(x):  " + a + "\n" + "b(x): " + b + "\n" + "c(x): " + c;
    }
    public static String Segregacja(int[]kolejnosc){
        int stash;
        for(int j=0;j<kolejnosc.length;j++){
            for(int i = 0; i < kolejnosc.length-1-j; i++){
                if(kolejnosc[i]>kolejnosc[i+1]){
                    stash = kolejnosc[i];
                    kolejnosc[i]=kolejnosc[i+1];
                    kolejnosc[i+1]=stash;
                }

                System.out.println(i);
            }
        }
        return kolejnosc[0]+" "+kolejnosc[1]+" " + kolejnosc[2];
    }
    public static String Uczelnia(boolean padaDeszcz, boolean jestAutobus){
        if(padaDeszcz &&  jestAutobus){
            return "Weź parasol\nDostaniesz się na uczelnie";
        }else if(padaDeszcz &&  !jestAutobus){
            return "Nie dostaniesz się na uczelnię";
        }else if(!padaDeszcz &&  jestAutobus){
            return "Dostaniesz się na uczelnie\nMiłego dnia i pięknej pogody";
        }return "";
    }
    public static String Samochod(boolean znizka, boolean premia){
        if(znizka || premia){
            return "Możesz kupić samochod";
        }else if(!znizka){
            return "Możesz kupić samochod\nZniżki na samochód nie ma";
        }else if(!premia){
            return "Zakup samochod trzeba odłożyć na później...\nZniżki na samochód nie ma";
        }else
            return "";
    }
    public static double OperacjeMatemtyczne(double liczba1,double liczba2,double wyborOperacji){
        double wynik = 0;
        if(wyborOperacji==1){
            wynik=liczba1+liczba2;
        }else if(wyborOperacji==2){
            wynik=liczba1-liczba2;
        }else if(wyborOperacji==3){
            wynik=liczba1*liczba2;
        }else if(wyborOperacji==4){
            wynik=liczba1/liczba2;
        }else if(wyborOperacji==5){
            wynik=liczba1%liczba2;
        }
        return wynik;
    }
}
