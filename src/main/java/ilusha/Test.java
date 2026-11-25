package ilusha;

import com.google.gson.Gson;
import ilusha.JSON.EquipmentJsonData;
import model.EchipamentSportiv;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Scanner;

import static ilusha.MyFilter.DEFAULT_LIMIT_RANGE;
import static ilusha.MyFilter.readRange;

public class Test {

    private static final String EQUIPMENT_JSON_FILE = "/ilusha-equipment.json";

    private static void displayCollection(ArrayList<? extends EchipamentSportiv> collection) {
        for (EchipamentSportiv object : collection) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) throws IOException {
        //TASK2
        // EchipamentSportiv
        EchipamentSportiv equipmentNoArgs = new EchipamentSportiv();
        EchipamentSportiv equipmentAllArgs = new EchipamentSportiv(
                "Helmet", "SafeRide", new BigDecimal("129.99"), 0.6, 12
        );
        EchipamentSportiv equipmentCopy = new EchipamentSportiv(equipmentAllArgs);

        // Role
        Role roleNoArgs = new Role();
        Role roleAllArgs = new Role(
                "Inline Skates", "RollerPro", new BigDecimal("499.99"), 3.2, 8,
                42.0, 4, 80.0, "ABEC-7", true
        );
        Role roleCopy = new Role(roleAllArgs);

        // PatineGheata: no-argument, all-arguments, and copy constructors
        PatineGheata iceSkatesNoArgs = new PatineGheata();
        PatineGheata iceSkatesAllArgs = new PatineGheata(
                "Ice Skates", "IcePro", new BigDecimal("359.50"), 2.1, 10,
                39.0, "Hockey", "Stainless steel", 28.0, true
        );
        PatineGheata iceSkatesCopy = new PatineGheata(iceSkatesAllArgs);

        System.out.println(equipmentNoArgs);
        System.out.println(equipmentAllArgs);
        System.out.println(equipmentCopy);

        System.out.println(roleNoArgs);
        System.out.println(roleAllArgs);
        System.out.println(roleCopy);

        System.out.println(iceSkatesNoArgs);
        System.out.println(iceSkatesAllArgs);
        System.out.println(iceSkatesCopy);
        //TASK2

        // TASK 3
        // Why <Object>?? Polymorphism, no?
        ArrayList<EchipamentSportiv> esList = new ArrayList<>();
        ArrayList<Role> roleList = new ArrayList<>();
        ArrayList<PatineGheata> patineGheataList = new ArrayList<>();

        EquipmentJsonData equipmentData = readEquipmentJsonData();

        EquipmentJsonData.populateFromJson(equipmentData, esList, roleList, patineGheataList);

        // Iterate through
        System.out.println("EchipamentSportiv collection:");
        displayCollection(esList);

        System.out.println("\n\nRole collection:");
        displayCollection(roleList);

        System.out.println("\n\nPatineGheață collection:");
        displayCollection(patineGheataList);
        // TASK 3

        //TASK 4

        String typeOfFilterText = "What do u want to filter?\n0 -> Echipament Sportiv\t1 -> Role\t2 -> PatineGheata";
        String numberOfFiltersText = "What do u want to filter?\n1 -> price\t2 -> weight in kg\t 3 -> both\n\n";
        String skipText = " (Press enter to skip) -> ";

        String priceESFilterText = "Enter a price range" + skipText + "[Example: 0-130] ";

        Scanner sc = new Scanner(System.in);

        System.out.println(typeOfFilterText);
        int typeOfFilter = sc.nextInt();
        sc.nextLine();

        switch (typeOfFilter) {
            case 0 -> {
                System.out.println(numberOfFiltersText);
                int numberOfFilters = sc.nextInt();
                sc.nextLine();

                switch (numberOfFilters) {
                    case 1 -> {
                        System.out.println(priceESFilterText);
                        Double[] filterPriceLimit = readRange(sc);
                        MyFilter.filterEchipamentSportiv(esList, filterPriceLimit, DEFAULT_LIMIT_RANGE);
                    }
                    case 2 -> {
                        System.out.println("Enter weight range in kg" + skipText + "[Example: 2-3]");
                        Double[] filterWeightLimit = readRange(sc);
                        MyFilter.filterEchipamentSportiv(esList, DEFAULT_LIMIT_RANGE, filterWeightLimit);
                    }
                    case 3 -> {
                        System.out.println(priceESFilterText);
                        Double[] filterPriceLimit = readRange(sc);

                        System.out.println("Enter weight range in kg" + skipText + "[Example: 2-3]");
                        Double[] filterWeightLimit = readRange(sc);

                        MyFilter.filterEchipamentSportiv(esList, filterPriceLimit, filterWeightLimit);
                    }
                    default -> System.out.println("Invalid filter option.");
                }
            }
            case 1 -> {
                System.out.println("What do u want to filter?\n1 -> boot size\t2 -> number of wheels\t 3 -> both\n\n");
                int numberOfFilters = sc.nextInt();
                sc.nextLine();

                switch (numberOfFilters) {
                    case 1 -> {
                        // Make it for ranges
                        System.out.println("Enter a boot size -> ");
                        double bootSize = sc.nextDouble();
                        MyFilter.filterRole(roleList, bootSize, null);
                    }
                    case 2 -> {
                        System.out.println("Enter number of wheels -> ");
                        int wheelsPerSkate = sc.nextInt();
                        MyFilter.filterRole(roleList, null, wheelsPerSkate);
                    }
                    case 3 -> {
                        System.out.println("Enter a boot size -> ");
                        double bootSize = sc.nextDouble();

                        System.out.println("Enter number of wheels -> ");
                        int wheelsPerSkate = sc.nextInt();
                        MyFilter.filterRole(roleList, bootSize, wheelsPerSkate);
                    }
                    default -> System.out.println("Invalid filter option.");
                }
            }
            case 2 -> {
                System.out.println("Insulated? (true/false)" + skipText);
                String input = sc.nextLine();
                Boolean patineFilterInsulated = input.isBlank() ? null : Boolean.parseBoolean(input);

                System.out.println("Enter skate type" + skipText + "[Example: Hockey]");
                String patineFilterSkateType = sc.nextLine();

                MyFilter.filterPatineGheata(patineGheataList, patineFilterInsulated, patineFilterSkateType);
            }
            default -> System.out.println("Invalid equipment option.");
        }
    }

    private static EquipmentJsonData readEquipmentJsonData() throws IOException {
        InputStream inputStream = Test.class.getResourceAsStream(EQUIPMENT_JSON_FILE);

        if (inputStream == null) {
            throw new IllegalStateException("Could not find " + EQUIPMENT_JSON_FILE);
        }

        try (Reader reader = new InputStreamReader(inputStream, StandardCharsets.UTF_8)) {
            return new Gson().fromJson(reader, EquipmentJsonData.class);
        }
    }
    //TASK 4
}