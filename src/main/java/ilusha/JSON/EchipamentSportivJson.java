package ilusha.JSON;

import java.math.BigDecimal;

public class EchipamentSportivJson {
        String name;
        String brand;
        BigDecimal price;

        public double getWeightKg() {
                return weightKg;
        }

        public String getName() {
                return name;
        }

        public String getBrand() {
                return brand;
        }

        public BigDecimal getPrice() {
                return price;
        }

        public int getMinimumUserAge() {
                return minimumUserAge;
        }

        double weightKg;
        int minimumUserAge;
    }
