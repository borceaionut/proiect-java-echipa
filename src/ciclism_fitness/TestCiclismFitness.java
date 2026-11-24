
package ciclism_fitness;

import model.EchipamentSportiv;
import java.math.BigDecimal;

public class TestCiclismFitness {
    public static void main(String[] args) {

        // === EchipamentSportiv ===

        // Constructor fara argumente
        EchipamentSportiv e1 = new EchipamentSportiv();

        // Constructor cu toate argumentele
        EchipamentSportiv e2 = new EchipamentSportiv(
                "Equipment", "Adidas",
                new BigDecimal("200"), 5.0, 12
        );

        // Constructor de copiere
        EchipamentSportiv e3 = new EchipamentSportiv(e2);


        // === Bicicleta ===

        Bicicleta b1 = new Bicicleta();

        Bicicleta b2 = new Bicicleta(
                21, 27.5, "Aluminum", "Disc",
                true, "Mountain Bike", "Trek",
                new BigDecimal("2500"), 14.5, 12
        );

        Bicicleta b3 = new Bicicleta(b2);


        // === BandaAlergare ===

        BandaAlergare t1 = new BandaAlergare();

        BandaAlergare t2 = new BandaAlergare(
                20.0, 15.0, 3.0, 120.0,
                true, "RunMaster", "Technogym",
                new BigDecimal("7500"), 80.0, 16
        );

        BandaAlergare t3 = new BandaAlergare(t2);


        // === Afisare obiecte ===

        System.out.println("=== EchipamentSportiv ===");
        System.out.println(e1);
        System.out.println(e2);
        System.out.println(e3);

        System.out.println("=== Bicicleta ===");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);

        System.out.println("=== BandaAlergare ===");
        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);
    }
}
