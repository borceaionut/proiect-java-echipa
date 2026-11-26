package tenis_badminton;

import model.EchipamentSportiv;

import java.math.BigDecimal;

public class ModelTest {
    public void main(){
        EchipamentSportiv equipment1 = new EchipamentSportiv();

        EchipamentSportiv equipment2 = new EchipamentSportiv(
                "Ball", "Random", new BigDecimal("49.99"), 0.45, 8
        );

        EchipamentSportiv equipment3 = new EchipamentSportiv(equipment2);

        Paleta paleta1 = new Paleta();

        Paleta paleta2 = new Paleta(
                "Table tennis paddle", "Duper",
                new BigDecimal("59.99"), 0.25, 2,
                "Wood and carbon", "Tight", 2.0, 8, true
        );

        Paleta paleta3 = new Paleta(paleta2);

        Fileu fileu1 = new Fileu();

        Fileu fileu2 = new Fileu(
                "Tennis web", "SuperWeb",
                new BigDecimal("34.99"), 0.15, 4,
                "Tennis", 6.50, 0.76,"Nylon", false
        );


        Fileu fileu3 = new Fileu(fileu2);

        System.out.println("Equipment 1 = " + equipment1);
        System.out.println("Equipment 2 = " +equipment2);
        System.out.println("Equipment 2 = " +equipment3);

        System.out.println("Paleta 1 = " + paleta1);
        System.out.println("Paleta 2 = " + paleta2);
        System.out.println("Paleta 3 = " + paleta3);

        System.out.println("Fileu 1 = " + fileu1);
        System.out.println("Fileu 2 = " + fileu2);
        System.out.println("Fileu 3 = " +fileu3);


    }

}
