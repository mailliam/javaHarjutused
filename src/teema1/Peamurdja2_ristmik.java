package teema1;

import javafx.application.Application;
import javafx.stage.Stage;
import lib.Foor;

/**
 * Täpselt nagu oli fooriga, on nüüd ristmikuga. Kuidas esiteks
 * ristmik üles ehitada loe Foori README.md-st: https://github.com/KristerV/javaHarjutused
 */
public class Peamurdja2_ristmik extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        Foor foor1 = new Foor(Foor.YLEMINE, primaryStage);
        Foor foor2 = new Foor(Foor.ALUMINE, primaryStage);
        Foor foor3 = new Foor(Foor.VASAK, primaryStage);
        Foor foor4 = new Foor(Foor.PAREM, primaryStage);

        ylemineAlumine(foor1);
        ylemineAlumine(foor2);
        vasakParem(foor3);
        vasakParem(foor4);
    }
    public void ylemineAlumine(Foor foor) {
        int count = 0;
        while (count < 5) {
            foor.vahetaPunast();
            foor.paus(9.5);
            foor.vahetaKollast();
            foor.paus(1);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.vahetaRohelist();
            foor.paus(2);
            int count2 = 0;
            while (count2 < 7) {
                foor.vahetaRohelist();
                foor.paus(0.5);
                count2 = count2 + 1;
            }
            foor.vahetaKollast();
            foor.paus(1);
            foor.vahetaKollast();
            count = count + 1;
        }
    }

    public void vasakParem(Foor foor) {

        foor.vahetaPunast();
        foor.paus(1);

        int count3 = 0;

        while (count3 < 5) {

            foor.vahetaKollast();
            foor.paus(1);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.vahetaRohelist();
            foor.paus(2);

            int count4 = 0;
            while (count4 < 7) {
                foor.vahetaRohelist();
                foor.paus(0.5);
                count4 = count4 + 1;
            }

            foor.vahetaKollast();
            foor.paus(1);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.paus(9.5);

            count3 = count3 + 1;
        }
    }
}
