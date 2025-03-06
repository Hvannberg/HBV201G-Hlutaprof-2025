package hi.vidmot;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Dæmi 15 í Hlutaprófi 2025
 *
 *
 *****************************************************************************/
public class HlaupGangaApplication extends Application {
    /**
     * Les inn hlaupGanga.fxml og setur rótina á senu sem er tengd við gluggann
     * Opnar gluggann
     * @param stage glugginn
     * @throws IOException ef ekki tekst að lesa .fxml skrá
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HlaupGangaApplication.class
                .getResource("hlaupGanga.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Skrá hreyfingu ");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Ræsir forritið
     * @param args ónotað
     */
    public static void main(String[] args) {
        launch();
    }
}
