import java.math.BigDecimal;

public class Snowboard extends EchipamentSportiv {
    private double boardLengthCm;
    private double waistWidthMm;
    private String profile;
    private String ridingStyle;
    private boolean includesBindings;

    // 1. Constructor with no arguments
    public Snowboard() {
        super();
        this.boardLengthCm = 155.0;
        this.waistWidthMm = 250.0;
        this.profile = "Hybrid";
        this.ridingStyle = "All-Mountain";
        this.includesBindings = false;
    }

    // 2. Parameterized constructor
    public Snowboard(String name, String brand, BigDecimal price, double weightKg, int minimumUserAge,
                     double boardLengthCm, double waistWidthMm, String profile, String ridingStyle, boolean includesBindings) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.boardLengthCm = boardLengthCm;
        this.waistWidthMm = waistWidthMm;
        this.profile = profile;
        this.ridingStyle = ridingStyle;
        this.includesBindings = includesBindings;
    }

    // 3. Copy Constructor
    public Snowboard(Snowboard other) {
        super(other);
        this.boardLengthCm = other.boardLengthCm;
        this.waistWidthMm = other.waistWidthMm;
        this.profile = other.profile;
        this.ridingStyle = other.ridingStyle;
        this.includesBindings = other.includesBindings;
    }

    @Override
    public String getUsageInstructions() {
        return "Strap both boots securely into the bindings. Maintain balanced posture with knees slightly bent while carving down groomed slopes.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Wax the base every 4-5 riding days, sharpen steel edges regularly, and wipe dry after riding to prevent rust.";
    }

    // Getters and Setters
    public double getBoardLengthCm() { return boardLengthCm; }
    public void setBoardLengthCm(double boardLengthCm) { this.boardLengthCm = boardLengthCm; }

    public double getWaistWidthMm() { return waistWidthMm; }
    public void setWaistWidthMm(double waistWidthMm) { this.waistWidthMm = waistWidthMm; }

    public String getProfile() { return profile; }
    public void setProfile(String profile) { this.profile = profile; }

    public String getRidingStyle() { return ridingStyle; }
    public void setRidingStyle(String ridingStyle) { this.ridingStyle = ridingStyle; }

    public boolean isIncludesBindings() { return includesBindings; }
    public void setIncludesBindings(boolean includesBindings) { this.includesBindings = includesBindings; }

    @Override
    public String toString() {
        return "Snowboard [" + super.toString() +
                ", Length: " + boardLengthCm + " cm" +
                ", Waist: " + waistWidthMm + " mm" +
                ", Profile: " + profile +
                ", Style: " + ridingStyle +
                ", Bindings: " + (includesBindings ? "Yes" : "No") + "]";
    }
}
