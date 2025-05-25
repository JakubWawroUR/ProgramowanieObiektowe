import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<String> Pesele = new ArrayList<>();


        try{
            File plik = new File("E:\\School\\ProgramowanieJava\\LabyProgramowanieObiektowe\\Lab12\\src\\pesele\\pesele.txt");
            Scanner sc = new Scanner(plik);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                Pesele.add(line);
                System.out.println(line);
            }
            sc.close();
        }catch (FileNotFoundException e){
            System.out.println("Nie znaleziono pliku");
            e.printStackTrace();
        }
        Pesel pesel = new Pesel(Pesele);
        pesel.wyswietlListe();
    }
}
