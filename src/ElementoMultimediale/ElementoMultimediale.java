package ElementoMultimediale;

public abstract class ElementoMultimediale implements IElementoMultimediale {

    private String titolo;


    public ElementoMultimediale(String titolo) {
        this.titolo = titolo;

    }

    public String getTitolo() {
        return titolo;
    }

    // Metodo astratto che deve essere implementato dalle sottoclassi
    public abstract void play();


    // Implementazione del metodo esegui() definito nell'interfaccia IElementoMultimediale
    // Chiamo il metodo play(), che ho creato nelle sottoclassi
    @Override
    public void esegui() {
        play();
    }


}
