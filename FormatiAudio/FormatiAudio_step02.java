class TracciaAudio {
    protected String titolo;
    protected String autore;
    protected int durata;
    public TracciaAudio(String titolo, String autore, int durata) {
        this.titolo=titolo;
        this.autore = autore;
        this.durata= durata;
    }

    public void getInfo() {
        System.out.println("TRACCIA AUDIO : " + titolo + " , Autore : " + autore + " , Durata : " + durata);
    }
}

class Canzone extends TracciaAudio {
    private String album;
    public Canzone(String titolo, String autore, int durata, String album) {
        super(titolo, autore, durata);
        this.album = album;
    }

    @Override
    public void getInfo() {
        System.out.println("CANZONE : " + titolo + " , Autore : " + autore + " , Album : " + album + " , Durata : " + durata);
    }
}

class Podcast extends TracciaAudio {
    private int numeroEpisodio;
    public Podcast(String titolo, String autore, int durata, int numeroEpisodio) {
        super(titolo, autore, durata);
        this.numeroEpisodio = numeroEpisodio;
    }

    @Override
    public void getInfo() {
        System.out.println("PODCAST : " + titolo + " , Autore : " + autore + " , Num. episodio : " + numeroEpisodio + " , Durata : " + durata);
    }
}

public class Main {
    public static void main(String args[]) {
        TracciaAudio[] Playlist = {
            new Canzone("Albachiara", "Vasco Rossi", 243, "Non siamo mica gli americani!"),
            new Podcast("Pulp Podcast", "Fedez & Mr. Marra", 3600, 1),
            new Canzone("Nord sud ovest est", "883", 270, "Nord sud ovest est")

        };
        for (TracciaAudio brano : Playlist) {
            brano.getInfo();
        }
    }
}