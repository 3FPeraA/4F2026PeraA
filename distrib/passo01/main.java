package distrib.passo01;

class Prodotto {
    private String nome;
    private float prezzo;
    private String codice;

    public Prodotto(String nome, float prezzo, String codice) {
        this.nome = nome;
        this.prezzo = prezzo;
        this.codice = codice;
    }
    public getNome() {
        return nome;
    }
    public getCodice() {
        return codice;
    }
    public getPrezzo() {
        return prezzo;
    }
}

enum Monetina {
    DIECI_CENT(0.10),
    VENTI_CENT(0.20),
    CINQUANTA_CENT(0.50),
    UN_EURO(1.00),
    DUE_EURO(2.00);
    private final double valore;
    Monetina(double valore) {
        this.valore = valore;
    }
    public double getValore() {
        return valore;
    }
}

public class Slot {
    private String codiceSlot;
    private Prodotto prodotto;
    private int quantita;
    public Slot(String codiceSlot, Prodotto prodotto, int quantitaIniziale) {
        this.codiceSlot = codiceSlot;
        this.prodotto = prodotto;
        this.quantita = quantitaIniziale;
    }
    public boolean eDisponibile() {
        return false;
    }
    public Prodotto eroga() {
        return null;
    }
    public void ricarica(int quantita) {
    }
    public String getCodiceSlot() {
        return "";
    }
    public Prodotto getProdotto() {
        return null;
    }
    public int getQuantita() {
        return 0;
    }
}