package ElementoMultimediale;


public class Audio extends ElementoMultimediale {

    // Attributi specifici della classe Audio
    private int durata;
    private int volume;

    // Costruttore
    public Audio(String titolo, int durata, int volume) {
        super(titolo); // Chiama il costruttore della classe padre per inizializzare il titolo
        this.durata = durata;
        this.volume = volume;
    }


    public void alzaVolume() {
        volume++;
    }


    public void abbassaVolume() {

        if (volume > 0) {
            volume--;
        }
    }

    // Implementazione del metodo astratto play() definito nella classe ElementoMultimediale
    @Override
    public void play() {

        for (int i = 0; i < durata; i++) {

            System.out.println(getTitolo() + " " + "!".repeat(volume));
        }
    }
}

