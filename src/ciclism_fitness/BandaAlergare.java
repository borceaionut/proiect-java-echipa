package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class BandaAlergare extends EchipamentSportiv {

    private double maxSpeedKmh;
    private double maxInclinePercent;
    private double motorPowerHp;
    private double maxUserWeightKg;
    private boolean foldable;

    // Constructor fara argumente
    public BandaAlergare() {
        super();
        this.maxSpeedKmh = 0.0;
        this.maxInclinePercent = 0.0;
        this.motorPowerHp = 0.0;
        this.maxUserWeightKg = 0.0;
        this.foldable = false;
    }

    // Constructor cu argumente
    public BandaAlergare(double maxSpeedKmh, double maxInclinePercent, double motorPowerHp, double maxUserWeightKg,
                         boolean foldable, String name, String brand, BigDecimal price, double weightKg, int minimumUserAge) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.maxSpeedKmh = maxSpeedKmh;
        this.maxInclinePercent = maxInclinePercent;
        this.motorPowerHp = motorPowerHp;
        this.maxUserWeightKg = maxUserWeightKg;
        this.foldable = foldable;
    }

    // Constructor copy

    public BandaAlergare(BandaAlergare other){
        super(other);
        this.maxSpeedKmh = other.maxSpeedKmh;
        this.maxInclinePercent = other.maxInclinePercent;
        this.motorPowerHp = other.motorPowerHp;
        this.maxUserWeightKg = other.maxUserWeightKg;
        this.foldable = other.foldable;
    }

    // Getters
    public double getMaxSpeedKmh() { return maxSpeedKmh;}
    public double getMaxInclinePercent() { return maxInclinePercent;}
    public double getMotorPowerHp() { return motorPowerHp;}
    public double getMaxUserWeightKg() { return maxUserWeightKg;}
    public boolean getFoldable() { return foldable;}

    // Setters
    public void setMaxSpeedKmh(double maxSpeedKmh) { this.maxSpeedKmh = maxSpeedKmh;}
    public void setMaxInclinePercent(double maxInclinePercent) { this.maxInclinePercent = maxInclinePercent;}
    public void setMotorPowerHp(double motorPowerHp) { this.motorPowerHp = motorPowerHp;}
    public void setMaxUserWeightKg(double maxUserWeightKg) { this.maxUserWeightKg = maxUserWeightKg;}
    public void setFoldable(boolean foldable) { this.foldable = foldable;}

    // toString
    @Override
    public String toString(){
        return super.toString()
        + ", MaxSpeed: " + maxSpeedKmh + " km/h"
        + ", MaxIncline: " + maxInclinePercent + "%"
        + ", MotorPower: " + motorPowerHp + " hp"
        + ", MaxUserWeight: " + maxUserWeightKg + " kg"
        + ", Foldable: " + foldable;
    }


    @Override
    public String getUsageInstructions() {
        return "Start at low speed and use the safety key.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the running belt and lubricate it regularly.";
    }
}
