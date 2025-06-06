package Tasks;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ZliczanieSlow {

    public void ZliczSlowa() {

        Scanner skaner = new Scanner(System.in);

        System.out.println("Wprowadź tekst: ");
        String tekstWejsciowy = skaner.nextLine();

        String przetworzonyTekst = tekstWejsciowy.toLowerCase();


        przetworzonyTekst = przetworzonyTekst.replaceAll("[^a-z\\s]", "");

        String[] slowa = przetworzonyTekst.split("\\s+");

        Map<String, Integer> licznikiSlow = new HashMap<>();

        for (String slowo : slowa) {
            slowo = slowo.trim();
            if (!slowo.isEmpty()) {
                licznikiSlow.put(slowo, licznikiSlow.getOrDefault(slowo, 0) + 1);
            }
        }

        System.out.println("Wynik:");
        for (Map.Entry<String, Integer> wpis : licznikiSlow.entrySet()) {
            System.out.println(wpis.getKey() + ": " + wpis.getValue());
        }

        skaner.close();
    }
}