package ilusha;

import java.math.BigDecimal;
import java.util.ArrayList;

import model.EchipamentSportiv;

public class Test {

    private static void displayCollection(ArrayList<Object> collection) {
        for (Object object : collection) {
            System.out.println(object);
        }
    }

    public static void main(String[] args) {
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

        // TASK 3
        // Why <Object>?? Polymorphism, no?
        ArrayList<Object> esList = new ArrayList<Object>();
        ArrayList<Object> roleList = new ArrayList<Object>();
        ArrayList<Object> patineGheataList = new ArrayList<Object>();

        // Populate the lists
        for (int i = 0; i < 10; i++) {
            esList.add(new EchipamentSportiv());
            roleList.add(new Role());
            patineGheataList.add(new PatineGheata());
        }

        // Iterate through
        System.out.println("EchipamentSportiv collection:");
        displayCollection(esList);

        System.out.println("\n\nRole collection:");
        displayCollection(roleList);

        System.out.println("\n\nPatineGheață collection:");
        displayCollection(patineGheataList);

    }
}