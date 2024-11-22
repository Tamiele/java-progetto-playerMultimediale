package ElementoMultimediale;

import java.util.ArrayList;
import java.util.Scanner;

public class MainElementoMultimediale {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<ElementoMultimediale> arrayElementi = new ArrayList<>();

        // Ciclo che chiede all'utente di inserire 5 elementi multimediali
        for (int i = 0; i < 5; i++) {
            System.out.println("Scegli Elemento Multimediale: 1-Immagine, 2-Audio, 3-Video");
            int elemento = scanner.nextInt();
            scanner.nextLine();

            System.out.println("inserisci Titolo");
            String titolo = scanner.nextLine();

            // Switch per determinare quale tipo di elemento creare
            switch (elemento) {
                case 1: // Caso per creare un'Immagine
                    System.out.println("Inserisci la luminosità: ");
                    int luminosita = scanner.nextInt();
                    arrayElementi.add(new Immagine(titolo, luminosita));
                    break;

                case 2: // Caso per creare un Audio
                    System.out.println("Inserisci la durata: ");
                    int durataAudio = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeAudio = scanner.nextInt();
                    arrayElementi.add(new Audio(titolo, durataAudio, volumeAudio));
                    break;

                case 3: // Caso per creare un Video
                    System.out.println("Inserisci la durata: ");
                    int durataVideo = scanner.nextInt();
                    System.out.println("Inserisci il volume: ");
                    int volumeVideo = scanner.nextInt();
                    System.out.println("Inserisci la luminosità: ");
                    int luminositaVideo = scanner.nextInt();
                    arrayElementi.add(new Video(titolo, durataVideo, volumeVideo, luminositaVideo));
                    break;

                default: // Caso in cui l'utente inserisce un tipo non valido
                    System.out.println("Tipo non valido.");
                    i--;
                    break;
            }
        }

        int sceltaUtente;

        // Ciclo che permette all'utente di eseguire un elemento multimediale
        do {
            System.out.println("Scegli un Elemento Multimediale da eseguire da 1 a 5. Scegli 0 per chiudere il programma");
            sceltaUtente = scanner.nextInt();

            // Se la scelta è valida, esegui l'elemento corrispondente
            if (sceltaUtente > 0 && sceltaUtente <= arrayElementi.size()) {
                // Ottiengo l'elemento dalla lista, sottraggo-1 in modo da mostrare all'utente l'indice corretto
                ElementoMultimediale elemento = arrayElementi.get(sceltaUtente - 1);
                elemento.esegui();
            }

        } while (sceltaUtente != 0); // Il ciclo continua finché l'utente non inserisce 0

        System.out.println("Arrivederci e Grazie!");
        scanner.close();
    }
}

