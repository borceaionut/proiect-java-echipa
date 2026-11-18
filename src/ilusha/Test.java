package ilusha;

import java.math.BigDecimal;
import model.EchipamentSportiv;

public class Test {
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
    }
}