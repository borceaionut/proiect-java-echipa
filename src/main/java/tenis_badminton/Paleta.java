package tenis_badminton;

import model.EchipamentSportiv;

public class Paleta extends EchipamentSportiv {
    @Override
    public String getUsageInstructions(){
        return "Hold the paddle and use its playing surface to hit the ball";
    }
    @Override
    public String getMaintenanceInstructions(){
        return "Wipe the paddle and cleat it after use";
    }

}
