package beinagrind;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class BindingListenerController{
    @FXML
    private TextField efri;
    @FXML
    private TextField nedri;
    @FXML
    private Label label;
    @FXML
    private Label uppercaseLabel;

    @FXML
    public void initialize() {
        // Binding: label hefur sama texta og efri
        // forritið hér


        // Þegar nedri hluturinn breytist þá er nýi textinn settur í hástafi og settur í uppercaseText
        // og prentað út á console breyttist og nýja gildið
        // forritið hér
    }
}
