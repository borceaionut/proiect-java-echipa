package sporturi_iarna;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class TestSchiSnowboard {
    public static void main(String[] args) {

        // EchipamentSportiv
        EchipamentSportiv e1 = new EchipamentSportiv();

        EchipamentSportiv e2 = new EchipamentSportiv(
                "Casca", "Atomic",
                new BigDecimal("350.00"), 0.5, 10
        );

        EchipamentSportiv e3 = new EchipamentSportiv(e2);

        // Snowboard
        Snowboard sb1 = new Snowboard();

        Snowboard sb2 = new Snowboard(
                "Custom", "Burton",
                new BigDecimal("2200.00"), 3.0, 5,
                158.0, 255.0, "Camber", "All Mountain", true
        );

        Snowboard sb3 = new Snowboard(sb2);

        // Schi
        Schi s1 = new Schi();

        Schi s2 = new Schi(
                "Redster", "Atomic",
                new BigDecimal("1800.00"), 4.5, 8,
                170.0, 75.0, 14.5, "Slalom", true
        );

        Schi s3 = new Schi(s2);

        // Afisarea celor 9 obiecte
        System.out.println("=== ECHIPAMENT SPORTIV ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("\n=== SNOWBOARD ===");
        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        System.out.println("\n=== SCHI ===");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}