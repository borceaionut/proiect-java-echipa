package sporturi_iarna;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class Schi extends EchipamentSportiv {

    private double skiLengthCm;
    private double waistWidthMm;
    private double turnRadiusM;
    private String skiType;
    private boolean includesBindings;

    // Constructor fara parametri
    public Schi() {
        super();
        this.skiLengthCm = 170.0;
        this.waistWidthMm = 75.0;
        this.turnRadiusM = 15.0;
        this.skiType = "All-Mountain";
        this.includesBindings = true;
    }

    // Constructor cu toti parametrii
    public Schi(String name, String brand, BigDecimal price,
                double weightKg, int minimumUserAge,
                double skiLengthCm, double waistWidthMm,
                double turnRadiusM, String skiType,
                boolean includesBindings) {

        super(name, brand, price, weightKg, minimumUserAge);

        this.skiLengthCm = skiLengthCm;
        this.waistWidthMm = waistWidthMm;
        this.turnRadiusM = turnRadiusM;
        this.skiType = skiType;
        this.includesBindings = includesBindings;
    }

    // Constructor de copiere
    public Schi(Schi other) {
        super(other);

        this.skiLengthCm = other.skiLengthCm;
        this.waistWidthMm = other.waistWidthMm;
        this.turnRadiusM = other.turnRadiusM;
        this.skiType = other.skiType;
        this.includesBindings = other.includesBindings;
    }

    // Getteri si setteri
    public double getSkiLengthCm() {
        return skiLengthCm;
    }

    public void setSkiLengthCm(double skiLengthCm) {
        this.skiLengthCm = skiLengthCm;
    }

    public double getWaistWidthMm() {
        return waistWidthMm;
    }

    public void setWaistWidthMm(double waistWidthMm) {
        this.waistWidthMm = waistWidthMm;
    }

    public double getTurnRadiusM() {
        return turnRadiusM;
    }

    public void setTurnRadiusM(double turnRadiusM) {
        this.turnRadiusM = turnRadiusM;
    }

    public String getSkiType() {
        return skiType;
    }

    public void setSkiType(String skiType) {
        this.skiType = skiType;
    }

    public boolean isIncludesBindings() {
        return includesBindings;
    }

    public void setIncludesBindings(boolean includesBindings) {
        this.includesBindings = includesBindings;
    }

    @Override
    public String toString() {
        return "Schi [" +
                super.toString() +
                ", Length: " + skiLengthCm + " cm" +
                ", Waist: " + waistWidthMm + " mm" +
                ", Turn Radius: " + turnRadiusM + " m" +
                ", Type: " + skiType +
                ", Bindings: " + (includesBindings ? "Yes" : "No") +
                "]";
    }
}