package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class BandaAlergare extends EchipamentSportiv {

    @Override
    public String getUsageInstructions() {
        return "Start at low speed and use the safety key.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the running belt and lubricate it regularly.";
    }
}
