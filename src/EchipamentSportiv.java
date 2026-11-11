import java.math.BigDecimal;

public class EchipamentSportiv implements EquipmentInstructions {
    private String name;
    private String brand;
    private BigDecimal price;
    private double weightKg;
    private int minimumUserAge;

    // 1. No-argument constructor
    public EchipamentSportiv() {
        this.name = "Unknown Equipment";
        this.brand = "Generic";
        this.price = BigDecimal.ZERO;
        this.weightKg = 0.0;
        this.minimumUserAge = 0;
    }

    // 2. Parameterized constructor
    public EchipamentSportiv(String name, String brand, BigDecimal price, double weightKg, int minimumUserAge) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.weightKg = weightKg;
        this.minimumUserAge = minimumUserAge;
    }

    // 3. Copy constructor
    public EchipamentSportiv(EchipamentSportiv other) {
        this.name = other.name;
        this.brand = other.brand;
        this.price = other.price;
        this.weightKg = other.weightKg;
        this.minimumUserAge = other.minimumUserAge;
    }

    // Methods from EquipmentInstructions interface
    @Override
    public String getUsageInstructions() {
        return "Use the sports equipment according to the manufacturer's safety guidelines and wear appropriate protective gear.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean and dry the equipment after each use. Store in a cool, dry place away from direct sunlight.";
    }

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getBrand() { return brand; }
    public void setBrand(String brand) { this.brand = brand; }

    public BigDecimal getPrice() { return price; }
    public void setPrice(BigDecimal price) { this.price = price; }

    public double getWeightKg() { return weightKg; }
    public void setWeightKg(double weightKg) { this.weightKg = weightKg; }

    public int getMinimumUserAge() { return minimumUserAge; }
    public void setMinimumUserAge(int minimumUserAge) { this.minimumUserAge = minimumUserAge; }

    @Override
    public String toString() {
        return "Name: " + name + ", Brand: " + brand + ", Price: " + price + " RON, Weight: " + weightKg + " kg, Min Age: " + minimumUserAge;
    }
}
