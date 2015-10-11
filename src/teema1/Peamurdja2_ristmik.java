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

        tsykkel(foor1,0);
        tsykkel(foor2,0);
        tsykkel(foor3,1);
        tsykkel(foor4,1);

    }

    public void tsykkel (Foor foor, int suund) {

        int count=suund;


        while (count<10) {

            if (count != 0) {
                foor.vahetaPunast();
                foor.paus(6);
                foor.vahetaKollast();
                foor.paus(0.6);
                foor.vahetaKollast();
                foor.vahetaPunast();
            }
                    foor.vahetaRohelist();
                    foor.paus(2);
                    int count2 = 0;
                    while (count2 < 7) {
                        foor.vahetaRohelist();
                        foor.paus(0.5);
                        count2 = count2 + 1;
                    }
                    foor.vahetaKollast();
                    foor.paus(1.5);
                    foor.vahetaKollast();
                    count = count + 1;

            }
        }

    }

/**

        vertikaal(foor1, foor2);
        horisontaal(foor3, foor4);

    }
    public void vertikaal (Foor foor1, Foor foor2) {
        foor1.vahetaRohelist();
        foor2.vahetaRohelist();
        rohelisestpunaseks(foor1);
        rohelisestpunaseks(foor2);
    }


    public void horisontaal (Foor foor3, Foor foor4) {
        foor3.vahetaRohelist();
        foor4.vahetaRohelist();
        punasestroheliseks(foor3);
        punasestroheliseks(foor4);
    }

        public void rohelisestpunaseks (Foor foor) {
        int count = 0;
        while (count < 5) {
            foor.vahetaPunast();
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaRohelist();
            foor.paus(0.5);
            foor.vahetaKollast();
            foor.paus(1);
            foor.vahetaKollast();
            foor.vahetaPunast();
            foor.vahetaPunast();
            count = count + 1;
        }
    }
    public void punasestroheliseks(Foor foor){
        foor.vahetaKollast();
        foor.paus(0.5);
        foor.vahetaPunast();
*/