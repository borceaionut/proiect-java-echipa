package tenis_badminton;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class Racheta extends EchipamentSportiv {

    private String sport;
    private String frameMaterial;
    private double headAreaCm2;
    private double gripSizeCm;
    private boolean preStrung;

    public Racheta() {
        super();
        this.sport = "Tenis";
        this.frameMaterial = "Grafit";
        this.headAreaCm2 = 645.0;
        this.gripSizeCm = 11.0;
        this.preStrung = true;
    }

    public Racheta(String name, String brand, BigDecimal price, double weightKg, int minimumUserAge,
                   String sport, String frameMaterial, double headAreaCm2,
                   double gripSizeCm, boolean preStrung) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.sport = sport;
        this.frameMaterial = frameMaterial;
        this.headAreaCm2 = headAreaCm2;
        this.gripSizeCm = gripSizeCm;
        this.preStrung = preStrung;
    }

    public Racheta(Racheta other) {
        super(other);
        this.sport = other.sport;
        this.frameMaterial = other.frameMaterial;
        this.headAreaCm2 = other.headAreaCm2;
        this.gripSizeCm = other.gripSizeCm;
        this.preStrung = other.preStrung;
    }

    @Override
    public String getUsageInstructions() {
        return "Use the racket with proper grip technique and avoid hitting hard surfaces.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Check string tension regularly and store the racket in a protective cover.";
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getFrameMaterial() {
        return frameMaterial;
    }

    public void setFrameMaterial(String frameMaterial) {
        this.frameMaterial = frameMaterial;
    }

    public double getHeadAreaCm2() {
        return headAreaCm2;
    }

    public void setHeadAreaCm2(double headAreaCm2) {
        this.headAreaCm2 = headAreaCm2;
    }

    public double getGripSizeCm() {
        return gripSizeCm;
    }

    public void setGripSizeCm(double gripSizeCm) {
        this.gripSizeCm = gripSizeCm;
    }

    public boolean isPreStrung() {
        return preStrung;
    }

    public void setPreStrung(boolean preStrung) {
        this.preStrung = preStrung;
    }

    @Override
    public String toString() {
        return "Racheta [" + super.toString()
                + ", Sport: " + sport
                + ", Frame Material: " + frameMaterial
                + ", Head Area: " + headAreaCm2 + " cm2"
                + ", Grip Size: " + gripSizeCm + " cm"
                + ", Pre-Strung: " + (preStrung ? "Yes" : "No")
                + "]";
    }
}