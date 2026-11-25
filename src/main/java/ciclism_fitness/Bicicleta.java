package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class Bicicleta extends EchipamentSportiv{

    private int numarViteze;

    public Bicicleta(String name, String brand, BigDecimal price,
                     double weightKg, int minimumUserAge, int numarViteze){

        super(name, brand, price, weightKg, minimumUserAge);
        this.numarViteze = numarViteze;
    }

    public int getNumarViteze(){
        return numarViteze;
    }

    public void setNumarViteze(int numarViteze){
        this.numarViteze = numarViteze;
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
