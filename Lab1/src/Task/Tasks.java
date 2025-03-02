package Task;

public class Tasks {

    public String DataUser(){
        return "Jakub, 20";
    }
    public String Dzialania(int liczba1, int liczba2){
        return "Suma: " + (liczba1 + liczba2) + "\nRóżnica: "+(liczba1 - liczba2) + "\nIloczyn: " + (liczba1 * liczba2);
    }
    public String Parzystosc(int liczba){
        if((liczba % 2) == 0){
            return "Liczba parzysta";
        }else{
            return "Liczba nie parzysta";
        }
    }
    public String Podzielna(int liczba){
        if(liczba % 5 == 0 && liczba % 3 == 0){
            return "Jest podzielna przez 3 i 5";
        }else{
            return "Nie jest podzielna przez 3 i 5";
        }
    }
    public int Potega3(int liczba){
        return liczba*liczba*liczba;
    }
    public double Pierwiastek(int liczba){
        return Math.sqrt(liczba);
    }
    public String TrojkatProstokatny(int liczba1, int liczba2,int liczba3){
        if(liczba1 + liczba2 >= liczba3 && liczba2 + liczba3 >= liczba1 && liczba1 + liczba3 >= liczba2){
           if(liczba1*liczba1 + liczba2*liczba2 == liczba3*liczba3 || liczba1*liczba1+liczba3*liczba3==liczba2*liczba2 || liczba2*liczba2+liczba3*liczba3==liczba1*liczba1){
               return "Trojkat prostokatny";
           }else{
               return "Trojkat nie jest prostokatny";
           }
        }else{
            return "Nie mozna stworzyc trojkata";
        }
    }
}
