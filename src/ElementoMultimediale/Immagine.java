package ElementoMultimediale;


public class Immagine extends ElementoMultimediale {

    // Attributo specifico della classe Immagine: luminosità
    private int luminosita;

    // Costruttore
    public Immagine(String titolo, int luminosita) {
        super(titolo); // Chiama il costruttore della classe padre per inizializzare il titolo
        this.luminosita = luminosita;
    }


    public void aumentaLuminosita() {
        luminosita++;
    }


    public void diminuisciLuminosita() {

        if (luminosita > 0) {
            luminosita--;
        }
    }

    // Metodo che mostra l'immagine (simulata con la stampa della luminosità)
    public void show() {
        // Stampa il titolo e una sequenza di asterischi (*) pari alla luminosità
        System.out.println(getTitolo() + " " + "*".repeat(luminosita));
    }

    // Implementazione del metodo esegui() che esegue il metodo show()
    @Override
    public void esegui() {
        show(); // Mostra l'immagine (simulata con la stampa della luminosità)
    }

    // Implementazione del metodo astratto play() (non viene utilizzato in questa classe ma bisogna implementarlo per forza)
    @Override
    public void play() {

    }
}

