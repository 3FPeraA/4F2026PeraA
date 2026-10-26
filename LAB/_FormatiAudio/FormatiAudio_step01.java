class TracciaAudio {
    private String titolo;
    private String autore;
    private int durata;
    public TracciaAudio(String titolo, String autore, int durata) {
        this.titolo=titolo;
        this.autore = autore;
        this.durata= durata;
    }
}

class Canzone extends TracciaAudio {
    private String album;
    public Canzone(String titolo, String autore, int durata, String album) {
        super(titolo, autore, durata);
        this.album = album;
    }
}

class Podcast extends TracciaAudio {
    private int numeroEpisodio;
    public Podcast(String titolo, String autore, int durata, int numeroEpisodio) {
        super(titolo, autore, durata);
        this.numeroEpisodio = numeroEpisodio;
    }
}