package tenis_badminton;

import model.EchipamentSportiv;

public class Racheta extends EchipamentSportiv {

    @Override
    public String getUsageInstructions() {
        return "Use the racket with proper grip technique and avoid hitting hard surfaces.";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Check string tension regularly and store the racket in a protective cover.";
    }
}