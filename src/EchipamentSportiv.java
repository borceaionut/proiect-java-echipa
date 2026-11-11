public abstract class EchipamentSportiv {
    private String denumire;
    private String marca;
    private double pret;
    private int stoc;

    // 1. Constructor fara argumente
    public EchipamentSportiv() {
        this.denumire = "Necunoscut";
        this.marca = "Fara marca";
        this.pret = 0.0;
        this.stoc = 0;
    }

    // 2. Constructor cu toate argumentele
    public EchipamentSportiv(String denumire, String marca, double pret, int stoc) {
        this.denumire = denumire;
        this.marca = marca;
        this.pret = pret;
        this.stoc = stoc;
    }

    // 3. Constructor de copiere
    public EchipamentSportiv(EchipamentSportiv altul) {
        this.denumire = altul.denumire;
        this.marca = altul.marca;
        this.pret = altul.pret;
        this.stoc = altul.stoc;
    }

    // Metode abstracte cerute la punctul 1 din PDF
    public abstract void afiseazaModUtilizare();
    public abstract double calculeazaPretRedus(double procentReducere);

    // Getters si Setters
    public String getDenumire() { return denumire; }
    public void setDenumire(String denumire) { this.denumire = denumire; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public double getPret() { return pret; }
    public void setPret(double pret) { this.pret = pret; }

    public int getStoc() { return stoc; }
    public void setStoc(int stoc) { this.stoc = stoc; }

    @Override
    public String toString() {
        return "Denumire: " + denumire + ", Marca: " + marca + ", Pret: " + pret + " RON, Stoc: " + stoc;
    }
}
