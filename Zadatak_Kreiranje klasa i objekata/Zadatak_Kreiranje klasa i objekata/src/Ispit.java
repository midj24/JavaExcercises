public class Ispit extends Predmet {
    private String datumOdrzavanja; // String (npr. "22.12.2025.")

    public Ispit(String nazivPredmeta, String datumOdrzavanja) {
        super(nazivPredmeta);
        this.datumOdrzavanja = datumOdrzavanja;
    }

    public String getDatumOdrzavanja() { return datumOdrzavanja; }
    public void setDatumOdrzavanja(String datumOdrzavanja) { this.datumOdrzavanja = datumOdrzavanja; }

    @Override
    public String toString() {
        return "Ispit iz predmeta \"" + getNazivPredmeta() + "\" se održava: " + datumOdrzavanja;
    }
}