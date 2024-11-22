package ElementoMultimediale;


public class Video extends ElementoMultimediale {

    // Attributi specifici della classe Video: volume, luminosità e durata
    private int volume;
    private int luminosita;
    private int durata;

    // Costruttore
    public Video(String titolo, int volume, int luminosita, int durata) {
        super(titolo); // Chiama il costruttore della classe padre per inizializzare il titolo
        this.volume = volume;
        this.luminosita = luminosita;
        this.durata = durata;
    }


    public void alzaVolume() {
        volume++;
    }


    public void abbassaVolume() {

        if (volume > 0) {
            volume--;
        }
    }


    public void aumentaLuminosita() {
        luminosita++;
    }


    public void diminuisciLuminosita() {

        if (luminosita > 0) {
            luminosita--;
        }
    }

    // Implementazione del metodo astratto play()
    @Override
    public void play() {
        // Simula la riproduzione del video per la durata specificata
        // Stampa il titolo, il volume (rappresentato da "!" ripetuti) e la luminosità (rappresentata da "*" ripetuti)
        for (int i = 0; i < durata; i++) {
            System.out.println(getTitolo() + " " + "!".repeat(volume) + " " + "*".repeat(luminosita));
        }
    }
}

