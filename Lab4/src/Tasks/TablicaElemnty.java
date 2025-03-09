package Tasks;

public class TablicaElemnty {
    public static void wypisanieElementów(){
        int[] Parzysta = {3,12,543,75,12,87,32,13};
        int[] Nieparzysta = {6,11,523,25,22,82,12,101,2};
        System.out.println("Parzysta tablica:");
        for(int i=0;i<Parzysta.length;i=i+2){
            System.out.println(Parzysta[i]);
        }
        System.out.println("Nieparzysta tablica:");
        for(int i=0;i<Nieparzysta.length;i=i+2){
            System.out.println(Nieparzysta[i]);
        }
    }
}
