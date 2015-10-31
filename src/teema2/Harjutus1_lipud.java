package teema2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

/**
 * 1. Joonista eesti lipp kasutades kolme Rectangle
 * 2. Joonista Jaapani lipp kasutades Rectangle ja Circle
 */
public class Harjutus1_lipud extends Application {    //ei ole static class

    @Override                                           //start meetod on application classist pärinev, main meetod on kuskil applicationi sees
    public void start(Stage lava) throws Exception {
        eestiLipp();
        jaapaniLipp();
    }

    private void eestiLipp() {
        Stage lava=new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane,600,300);
        lava.setScene(stseen);

        Rectangle kast1 = new Rectangle (0,0,600,100);   //kui on kaks parameetrit, siis laius ja kõrgus. Kui on neli parameetrit, siis need on alguse x ja algus y
        kast1.setFill(Color.BLUE);
        pane.getChildren().add(kast1);

        Rectangle kast2 = new Rectangle (0,100,600,100);
        kast2.setFill(Color.BLACK);
        pane.getChildren().add(kast2);

        Rectangle kast3 = new Rectangle (0,200,600,100);
        kast3.setFill(Color.WHITE);
        pane.getChildren().add(kast3);

        lava.show();
    }

    private void jaapaniLipp() {
        Stage lava = new Stage();
        Pane pane = new Pane();
        Scene stseen = new Scene(pane, 600, 300);
        lava.setScene(stseen);

        Rectangle kast1 = new Rectangle(0, 0, 600, 300);
        kast1.setFill(Color.WHITE);
        pane.getChildren().add(kast1);

        Circle ring = new Circle(300, 150, 100);
        ring.setFill(Color.RED);
        pane.getChildren().add(ring);

        lava.show();
    }

}
