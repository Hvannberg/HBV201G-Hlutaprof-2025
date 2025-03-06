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
 *  Lýsing  : Hlutapróf 2025 - Dæmi 16
 *
 *
 *****************************************************************************/

public class BindingListenerApplication extends Application {
    /**
     * Les in .fxml skrána  og opnar glugga
     * @param stage
     * @throws IOException
     */
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(BindingListenerApplication.class.getResource("bindinglistener-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Binding og Listener");
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