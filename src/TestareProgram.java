import jocuri_curte.Minge;
import model.EchipamentSportiv;
import tenis_badminton.Racheta;

import java.math.BigDecimal;

public class TestareProgram {

    public static void main(String[] args) {

        EchipamentSportiv equipment1 = new EchipamentSportiv();

        EchipamentSportiv equipment2 = new EchipamentSportiv(
                "Universal Equipment",
                "Nike",
                new BigDecimal("199.99"),
                2.5,
                12
        );

        EchipamentSportiv equipment3 = new EchipamentSportiv(equipment2);

        Minge ball1 = new Minge();

        Minge ball2 = new Minge(
                "Champions Ball",
                "Adidas",
                new BigDecimal("149.99"),
                0.45,
                6,
                "Football",
                "5",
                "Synthetic Leather",
                68.0,
                true
        );

        Minge ball3 = new Minge(ball2);

        Racheta racket1 = new Racheta();

        Racheta racket2 = new Racheta(
                "Pure Drive",
                "Babolat",
                new BigDecimal("799.99"),
                0.30,
                10,
                "Tennis",
                "Graphite",
                645.0,
                11.0,
                true
        );

        Racheta racket3 = new Racheta(racket2);

        System.out.println("SPORTS EQUIPMENT");
        System.out.println(equipment1);
        System.out.println(equipment2);
        System.out.println(equipment3);

        System.out.println();

        System.out.println("BALL");
        System.out.println(ball1);
        System.out.println(ball2);
        System.out.println(ball3);

        System.out.println();

        System.out.println("RACKET");
        System.out.println(racket1);
        System.out.println(racket2);
        System.out.println(racket3);

        System.out.println();

        System.out.println("BALL USAGE INSTRUCTIONS");
        System.out.println(ball2.getUsageInstructions());

        System.out.println("BALL MAINTENANCE INSTRUCTIONS");
        System.out.println(ball2.getMaintenanceInstructions());

        System.out.println();

        System.out.println("RACKET USAGE INSTRUCTIONS");
        System.out.println(racket2.getUsageInstructions());

        System.out.println("RACKET MAINTENANCE INSTRUCTIONS");
        System.out.println(racket2.getMaintenanceInstructions());
    }
}