package Tasks; // Umieszczamy enum w pakiecie Tasks

public enum Swiatlo {
    CZERWONE("Stój!"),
    ZOLTE("Uwaga!"),
    ZIELONE("Jedź!");

    private final String komunikat;

    Swiatlo(String komunikat) {
        this.komunikat = komunikat;
    }

    public String getKomunikat() {
        return komunikat;
    }
}