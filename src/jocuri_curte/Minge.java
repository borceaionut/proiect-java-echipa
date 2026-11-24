package jocuri_curte;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class Minge extends EchipamentSportiv {

    private String sport;
    private String size;
    private String material;
    private double circumferenceCm;
    private boolean suitableForOutdoorUse;

    public Minge() {
        super();
        this.sport = "Fotbal";
        this.size = "5";
        this.material = "Piele sintetica";
        this.circumferenceCm = 68.0;
        this.suitableForOutdoorUse = true;
    }

    public Minge(String name, String brand, BigDecimal price, double weightKg, int minimumUserAge,
                 String sport, String size, String material,
                 double circumferenceCm, boolean suitableForOutdoorUse) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.sport = sport;
        this.size = size;
        this.material = material;
        this.circumferenceCm = circumferenceCm;
        this.suitableForOutdoorUse = suitableForOutdoorUse;
    }

    public Minge(Minge other) {
        super(other);
        this.sport = other.sport;
        this.size = other.size;
        this.material = other.material;
        this.circumferenceCm = other.circumferenceCm;
        this.suitableForOutdoorUse = other.suitableForOutdoorUse;
    }

    @Override
    public String getUsageInstructions() {
        return "Inflate the ball to the recommended pressure and use it on a suitable playing surface.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the ball after use and store it away from extreme temperatures.";
    }

    public String getSport() {
        return sport;
    }

    public void setSport(String sport) {
        this.sport = sport;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getCircumferenceCm() {
        return circumferenceCm;
    }

    public void setCircumferenceCm(double circumferenceCm) {
        this.circumferenceCm = circumferenceCm;
    }

    public boolean isSuitableForOutdoorUse() {
        return suitableForOutdoorUse;
    }

    public void setSuitableForOutdoorUse(boolean suitableForOutdoorUse) {
        this.suitableForOutdoorUse = suitableForOutdoorUse;
    }

    @Override
    public String toString() {
        return "Minge [" + super.toString()
                + ", Sport: " + sport
                + ", Size: " + size
                + ", Material: " + material
                + ", Circumference: " + circumferenceCm + " cm"
                + ", Outdoor Use: " + (suitableForOutdoorUse ? "Yes" : "No")
                + "]";
    }
}