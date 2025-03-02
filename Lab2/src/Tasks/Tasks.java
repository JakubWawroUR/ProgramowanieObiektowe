package Tasks;
public class Tasks {
    public static String RownanieKwadratowe(int a,int b,int c){

        int delta = b*b  - 4*a*c;
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
}
