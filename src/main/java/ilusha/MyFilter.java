package ilusha;

import model.EchipamentSportiv;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

public class MyFilter {

    public static final Double[] DEFAULT_LIMIT_RANGE = {0.0, 999.99};

    static Double[] readRange(Scanner sc) {
        String input = sc.nextLine().trim();

        if (input.isBlank()) {
            return null;
        }

        String[] intervals = input.split("-");
        if (intervals.length != 2 || intervals[0].isBlank() || intervals[1].isBlank()) {
            System.out.println("Invalid range. Using default range.");
            return DEFAULT_LIMIT_RANGE;
        }

        return new Double[]{Double.parseDouble(intervals[0].trim()), Double.parseDouble(intervals[1].trim())};
    }

    // Filter Echipament Sportiv
    static void filterEchipamentSportiv(ArrayList<EchipamentSportiv> equipmentList, Double[] priceLimit, Double[] weightLimit) {
        for (EchipamentSportiv equipment : equipmentList) {
            boolean priceMatches = equipment.getPrice().compareTo(BigDecimal.valueOf(priceLimit[0])) >= 0
                    && equipment.getPrice().compareTo(BigDecimal.valueOf(priceLimit[1])) <= 0;

            boolean weightMatches = equipment.getWeightKg() >= weightLimit[0]
                    && equipment.getWeightKg() <= weightLimit[1];

            if (priceMatches && weightMatches) {
                System.out.println(equipment);
            }
        }
    }

    // Filter Patine Gheata
    static void filterPatineGheata(ArrayList<PatineGheata> patineGheataList, Boolean insulated, String skateType) {
        for (PatineGheata patineGheata : patineGheataList) {

            boolean insulatedMatches = insulated == null || patineGheata.isInsulated() == insulated;
            boolean skateTypeMatches = skateType.isBlank()
                    || (patineGheata.getSkateType() != null
                    && patineGheata.getSkateType().equalsIgnoreCase(skateType.trim()));

            if (insulatedMatches && skateTypeMatches) {
                System.out.println(patineGheata);
            }
        }

    }

    // Filter Role
    static void filterRole(ArrayList<Role> roleList, Double[] bootSizeLimit, Integer wheelsPerSkate) {
        for (Role role : roleList) {
            boolean bootSizeMatches = role.getBootSize() >= bootSizeLimit[0]
                    && role.getBootSize() <= bootSizeLimit[1];

            boolean wheelsPerSkateMatches = wheelsPerSkate == null || role.getWheelsPerSkate() == wheelsPerSkate;

            if (bootSizeMatches && wheelsPerSkateMatches) {
                System.out.println(role);
            }
        }

    }

}
