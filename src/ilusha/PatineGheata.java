package ilusha;

import model.EchipamentSportiv;

import java.math.BigDecimal;

public class PatineGheata extends EchipamentSportiv {

    private double bootSizeEu;
    private String skateType;
    private String bladeMaterial;
    private double bladeLengthCm;
    private boolean insulated;

    public PatineGheata() {
        super();
    }

    public PatineGheata(PatineGheata other) {
        super(other);
        this.bootSizeEu = other.bootSizeEu;
        this.skateType = other.skateType;
        this.bladeMaterial = other.bladeMaterial;
        this.bladeLengthCm = other.bladeLengthCm;
        this.insulated = other.insulated;
    }

    public PatineGheata(String name, String brand, BigDecimal price, double weightKg, int minimumUserAge, double bootSizeEu, String skateType, String bladeMaterial, double bladeLengthCm, boolean insulated) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.bootSizeEu = bootSizeEu;
        this.skateType = skateType;
        this.bladeMaterial = bladeMaterial;
        this.bladeLengthCm = bladeLengthCm;
        this.insulated = insulated;
    }

    public double getBootSizeEu() {
        return bootSizeEu;
    }

    public void setBootSizeEu(double bootSizeEu) {
        this.bootSizeEu = bootSizeEu;
    }

    public String getSkateType() {
        return skateType;
    }

    public void setSkateType(String skateType) {
        this.skateType = skateType;
    }

    public String getBladeMaterial() {
        return bladeMaterial;
    }

    public void setBladeMaterial(String bladeMaterial) {
        this.bladeMaterial = bladeMaterial;
    }

    public double getBladeLengthCm() {
        return bladeLengthCm;
    }

    public void setBladeLengthCm(double bladeLengthCm) {
        this.bladeLengthCm = bladeLengthCm;
    }

    public boolean isInsulated() {
        return insulated;
    }

    public void setInsulated(boolean insulated) {
        this.insulated = insulated;
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Dry the blades after each use and sharpen them as needed.";
    }

    @Override
    public String getUsageInstructions() {
        return "Tie the laces securely and skate only on ice.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nPatineGheata{" +
                "bootSizeEu=" + bootSizeEu +
                ", skateType='" + skateType + '\'' +
                ", bladeMaterial='" + bladeMaterial + '\'' +
                ", bladeLengthCm=" + bladeLengthCm +
                ", insulated=" + insulated +
                '}';
    }
}
