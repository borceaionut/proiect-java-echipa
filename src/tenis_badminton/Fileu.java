package tenis_badminton;

import model.EchipamentSportiv;

import java.math.BigDecimal;

public class Fileu extends EchipamentSportiv {
    private String sport;
    private double widthM;
    private double heightM;
    private String meshMaterial;
    private boolean includesPosts;


    public Fileu() {
        super();
        this.sport = "Unknown";
        this.widthM = 0.0;
        this.heightM = 0.0;
        this.meshMaterial = "Unknown";
        this.includesPosts = false;
    }
    public Fileu(
            String name,
            String brand,
            BigDecimal price,
            double weightKg,
            int minimumUserAge,
            String sport,
            double widthM,
            double heightM,
            String meshMaterial,
            boolean includesPosts
    ) {
            super(name, brand, price, weightKg, minimumUserAge);
            this.sport = sport;
            this.widthM = widthM;
            this.heightM = heightM;
            this.meshMaterial = meshMaterial;
            this.includesPosts = includesPosts;
        }


    public Fileu(Fileu other) {
            super(other);
            this.sport = other.sport;
            this.widthM = other.widthM;
            this.heightM = other.heightM;
            this.meshMaterial = other.meshMaterial;
            this.includesPosts = other.includesPosts;
        }
        public String getSport() {
            return sport;
        }
        public void setSport(String sport) {
            this.sport = sport;
        }

        public double getWidthM() {
            return widthM;
        }
        public void setWidthM(double widthM) {
            this.widthM = widthM;
        }

        public double getHeightM() {
            return heightM;
        }
        public void setHeightM(double heightM) {
            this.heightM = heightM;
        }

        public String getMeshMaterial() {
            return meshMaterial;
        }
        public void setMeshMaterial(String meshMaterial) {
            this.meshMaterial = meshMaterial;
        }

        public boolean isIncludesPosts() {
            return includesPosts;
        }
        public void setIncludesPosts(boolean includesPosts) {
            this.includesPosts = includesPosts;
        }
    @Override
    public String getUsageInstructions() {
        return "Check the net and adjust it to the posts and the required height";
    }

    @Override
    public String getMaintenanceInstructions() {
        return "Check net, clean it and store in a dry place";
    }

    @Override
    public String toString() {
        return "Fileu: " + super.toString()
                + ", sport='" + sport + "'"
                + ", widthM=" + widthM
                + ", heightM=" + heightM
                + ", meshMaterial='" + meshMaterial + "'"
                + ", includesPosts=" + includesPosts
                + "}";
    }
}





