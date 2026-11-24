package tenis_badminton;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class Paleta extends EchipamentSportiv {
    private String bladeMaterial;
    private String handleShake;
    private double spongeThicknessMM;
    private int playCount;
    private boolean competitionApproved;

    public Paleta(){
        super();
        this.bladeMaterial = "Unknown";
        this.handleShake = "Unknown";
        this.spongeThicknessMM = 0.0;
        this.playCount = 0;
        this.competitionApproved = false;
    }

    public Paleta(
            String name,
            String brand,
            BigDecimal price,
            double weightKg,
            int minimumUserAge,
            String bladeMaterial,
            String handleShape,
            double spongeThicknessMm,
            int playCount,
            boolean competitionApproved
    ) {
        super(name, brand, price, weightKg, minimumUserAge);
        this.bladeMaterial = bladeMaterial;
        this.handleShake = handleShape;
        this.spongeThicknessMM = spongeThicknessMm;
        this.playCount = playCount;
        this.competitionApproved = competitionApproved;
    }

    public Paleta(Paleta other){
        super(other);
        this.bladeMaterial = other.bladeMaterial;
        this.handleShake = other.handleShake;
        this.spongeThicknessMM = other.spongeThicknessMM;
        this.playCount = other.playCount;
        this.competitionApproved = other.competitionApproved;
    }

    public String getBladeMaterial() {
        return "\n" + bladeMaterial;
    }
    public void setBladeMaterial(String bladeMaterial) {
        this.bladeMaterial = bladeMaterial;
    }

    public String getHandleShake() {
        return handleShake;
    }
    public void setHandleShake(String handleShake) {
        this.handleShake = handleShake;
    }

    public double getSpongeThicknessMM() {
        return spongeThicknessMM;
    }
    public void setSpongeThicknessMM(double spongeThicknessMM) {
        this.spongeThicknessMM = spongeThicknessMM;
    }

    public int getPlayCount() {
        return playCount;
    }
    public void setPlayCount(int playCount) {
        this.playCount = playCount;
    }

    public boolean isCompetitionApproved() {
        return competitionApproved;
    }
    public void setCompetitionApproved(boolean competitionApproved) {
        this.competitionApproved = competitionApproved;
    }

    @Override
    public String getUsageInstructions(){
        return "Hold the paddle and use its playing surface to hit the ball";
    }
    @Override
    public String getMaintenanceInstructions(){
        return "Wipe the paddle and cleat it after use";

    }

    @Override
    public String toString() {
        return "Paleta: " +
                "parent=" + super.toString() +
                "bladeMaterial='" + bladeMaterial + '\'' +
                ", handleShake='" + handleShake + '\'' +
                ", spongeThicknessMM=" + spongeThicknessMM +
                ", playCount=" + playCount +
                ", competitionApproved=" + competitionApproved +
                '}';
    }
}