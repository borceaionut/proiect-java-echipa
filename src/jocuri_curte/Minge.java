package jocuri_curte;

import model.EchipamentSportiv;

public class Minge extends EchipamentSportiv {

    @Override
    public String getUsageInstructions() {
        return "Inflate the ball to the recommended pressure and use it on a suitable playing surface.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Clean the ball after use and store it away from extreme temperatures.";
    }
}