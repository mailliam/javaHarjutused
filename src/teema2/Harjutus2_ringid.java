package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * 1. Joonista kast kasutades jooni
 * 2. Joonista spiraal kasutades jooni (vaata ringi meetodi)
 * 3. Joonista propeller (nagu propeller.png) kasutades jooni
 */
public class Harjutus2_ringid extends Application{

    @Override
    public void start(Stage primaryStage) throws Exception {
        esimene();

    }

    private void esimene() {
        Stage lava1=new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane,300,300);
        lava1.setScene(stseen);

        lava1.show();

    }
}
