package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class Bicicleta extends EchipamentSportiv{

    @Override
    public String getUsageInstructions() {
        return "Wear a helmet and check the brakes before riding.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the chain and check tire pressure regularly.";
    }
}
