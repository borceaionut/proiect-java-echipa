package ilusha;

import model.EchipamentSportiv;

import java.math.BigDecimal;

public class Role extends EchipamentSportiv {

    private double bootSizeEu;
    private int wheelsPerSkate;
    private double wheelDiameterMm;
    private String bearingRating;
    private boolean hasHeelBrake;

    public Role() {
        super();
    }

    public Role(String name, String brand, BigDecimal price, double weightKg, int minimumUserAge, double bootSizeEu, int wheelsPerSkate, double wheelDiameterMm, String bearingRating, boolean hasHeelBrake) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.bootSizeEu = bootSizeEu;
        this.wheelsPerSkate = wheelsPerSkate;
        this.wheelDiameterMm = wheelDiameterMm;
        this.bearingRating = bearingRating;
        this.hasHeelBrake = hasHeelBrake;
    }

    public Role(Role other) {
        super(other);
        bootSizeEu = other.bootSizeEu;
        wheelsPerSkate = other.wheelsPerSkate;
        wheelDiameterMm = other.wheelDiameterMm;
        bearingRating = other.bearingRating;
        hasHeelBrake = other.hasHeelBrake;
    }

    public double getBootSizeEu() {
        return bootSizeEu;
    }

    public void setBootSizeEu(double bootSizeEu) {
        this.bootSizeEu = bootSizeEu;
    }

    public int getWheelsPerSkate() {
        return wheelsPerSkate;
    }

    public void setWheelsPerSkate(int wheelsPerSkate) {
        this.wheelsPerSkate = wheelsPerSkate;
    }

    public double getWheelDiameterMm() {
        return wheelDiameterMm;
    }

    public void setWheelDiameterMm(double wheelDiameterMm) {
        this.wheelDiameterMm = wheelDiameterMm;
    }

    public String getBearingRating() {
        return bearingRating;
    }

    public void setBearingRating(String bearingRating) {
        this.bearingRating = bearingRating;
    }

    public boolean isHasHeelBrake() {
        return hasHeelBrake;
    }

    public void setHasHeelBrake(boolean hasHeelBrake) {
        this.hasHeelBrake = hasHeelBrake;
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the wheels and check that they are secure.";
    }

    @Override
    public String getUsageInstructions() {
        return "Wear a helmet and pads. Skate on smooth surfaces.";
    }

    @Override
    public String toString() {
        return super.toString() + "\nRole{" +
                "bootSizeEu=" + bootSizeEu +
                ", wheelsPerSkate=" + wheelsPerSkate +
                ", wheelDiameterMm=" + wheelDiameterMm +
                ", bearingRating='" + bearingRating + '\'' +
                ", hasHeelBrake=" + hasHeelBrake +
                '}';
    }
}
