package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;


public class Bicicleta extends EchipamentSportiv{
    private int gearCount;
    private double wheelDiameterInches;
    private String frameMaterial;
    private String brakeType;
    private boolean hasSuspension;

    // Constructor fara argumente
    public Bicicleta(){
        super();
        this.gearCount = 0;
        this.wheelDiameterInches = 0.0;
        this.frameMaterial = "Unknown";
        this.brakeType = "None";
        this.hasSuspension = false;

    }
    // Constructor cu parametri
    public Bicicleta(int gearCount, double wheelDiameterInches, String frameMaterial,
                     String brakeType, boolean hasSuspension, String name, String brand, BigDecimal price,
                     double weightKg, int minimumUserAge){

        super(name, brand, price, weightKg, minimumUserAge);
        this.gearCount = gearCount;
        this.wheelDiameterInches = wheelDiameterInches;
        this.frameMaterial = frameMaterial;
        this.brakeType = brakeType;
        this.hasSuspension = hasSuspension;
    }

    public Bicicleta(Bicicleta other){
        super(other);
        this.gearCount = other.gearCount;
        this.wheelDiameterInches = other.wheelDiameterInches;
        this.frameMaterial = other.frameMaterial;
        this.brakeType = other.brakeType;
        this.hasSuspension = other.hasSuspension;
    }

    // Getters
    public int getGearCount(){
        return gearCount;
    }
    public double getWheelDiameterInches(){
        return wheelDiameterInches;
    }
    public String getFrameMaterial(){
        return frameMaterial;
    }
    public String getBrakeType(){
        return brakeType;
    }
    public boolean getHasSuspension() { return hasSuspension;}

    // Setters
    public void setGearCount(int gearCount){
        this.gearCount = gearCount;
    }
    public void setWheelDiameterInches(double wheelDiameterInches){
        this.wheelDiameterInches = wheelDiameterInches;
    }
    public void setFrameMaterial(String frameMaterial){
        this.frameMaterial = frameMaterial;
    }
    public void setBrakeType(String brakeType){
        this.brakeType = brakeType;
    }
    public void setHasSuspension (boolean hasSuspension){
        this.hasSuspension = hasSuspension;
    }

    // toString
    @Override
    public String toString() {
        return super.toString()
        + ", Gear Count: " + gearCount
        + ", Wheel Diameter: " + wheelDiameterInches + " inches"
        + ", Frame Material: " + frameMaterial
        + ", Brake Type: " + brakeType
        + ", Has Suspension: " + hasSuspension;
    }


    @Override
    public String getUsageInstructions() {
        return "Wear a helmet and check the brakes before riding.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the chain and check tire pressure regularly.";
    }
}
