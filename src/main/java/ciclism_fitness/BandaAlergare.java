package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class BandaAlergare extends EchipamentSportiv {

    private double vitezaMaxima;

    public BandaAlergare(String name, String brand, BigDecimal price,
                         double weightKg, int minimumUserAge, double vitezaMaxima) {

        super(name, brand, price, weightKg, minimumUserAge);
        this.vitezaMaxima = vitezaMaxima;
    }

    public double getVitezaMaxima() {
        return vitezaMaxima;
    }

    public void setVitezaMaxima(double vitezaMaxima) {
        this.vitezaMaxima = vitezaMaxima;
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
