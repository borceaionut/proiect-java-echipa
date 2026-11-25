package ilusha;

import model.EchipamentSportiv;

public class Role extends EchipamentSportiv {

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the wheels and check that they are secure.";
    }

    @Override
    public String getUsageInstructions() {
        return "Wear a helmet and pads. Skate on smooth surfaces.";
    }
}
