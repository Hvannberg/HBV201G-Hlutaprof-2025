package hi.vidmot;

import hi.vinnsla.HlaupGanga;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : Controller fyrir forritið. Sér um að skrá hreyfingu og halda utan um
 *  samtölur hlaupa og ganga
 *
 *****************************************************************************/
public class HlaupGangaController {

    // tilviksbreytur
    public TextField fxHlaup; // fjöldi hlaupinna km
    public TextField fxGanga; // fjöldi genginna km
    public Label fxHlaupSamtals; // samtals hlaupnir km
    public Label fxGangaSamtals; // samtals gengnir km
    public Label fxSamtals; // samtals hlaupnir og gengnir km

    // vinnsla
    HlaupGanga hlaupGanga = new HlaupGanga();

    // aðferðir

    /**
     * Sjálfgefinn smiður
     */
    public HlaupGangaController() {}

    /**
     * Aðferð fyrir Skrá hreyfingu hnappinn.
     * Uppfærir samtölur genginna og hlaupna km
     * @param actionEvent ónotað
     */
    public void skraHreyfingu(ActionEvent actionEvent) {
        fxSamtals.setText(hlaupGanga
                .skraHreyfingu(fxHlaup.getText(),
                        fxGanga.getText()) + " km");
        fxGangaSamtals.setText(hlaupGanga.getGangaSamtals()+" km");
        fxHlaupSamtals.setText(hlaupGanga.getHlaupSamtals()+" km");
        fxHlaup.clear();
        fxGanga.clear();
    }
}
