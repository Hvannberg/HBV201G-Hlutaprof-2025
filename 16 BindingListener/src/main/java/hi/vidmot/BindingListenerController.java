package hi.vidmot;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Hlutapróf 2025 - Dæmi 16
 *
 *
 *****************************************************************************/

public class BindingListenerController {
    @FXML
    private TextField efri;
    @FXML
    private TextField nedri;
    @FXML
    private Label label;
    @FXML
    private Label uppercaseLabel;

    /**
     * Setur upp bind reglu fyrir label sem inniheldur það sama og efri
     * og listener á nedri sem vaktar breytingu á nedri, setur í upper case og prentar á console
     */
    @FXML
    public void initialize() {
        // Binding: label hefur sama texta og efri
        label.textProperty().bind(efri.textProperty());

        // Þegar nedri hluturinn breytist þá er nýi textinn settur í hástafi
        // og settur í uppercaseText
        // og prentað út á console breyttist og nýja gildið
        nedri.textProperty().addListener((vaktad, gamla, nyja) -> {
            uppercaseLabel.setText(nyja.toUpperCase());
            System.out.println("nedri breyttist: " + nyja);
        });
    }
}
