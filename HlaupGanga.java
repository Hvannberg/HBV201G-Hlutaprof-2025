package hi.vinnsla;

/******************************************************************************
 *  Nafn    : Ebba Þóra Hvannberg
 *  T-póstur: ebba@hi.is
 *
 *  Lýsing  : 
 *
 *
 *****************************************************************************/
public class HlaupGanga {

    private int hlaup; // samtals fjöldi km hlaup
    private int ganga; // samtals fjöldi km ganga
    private int hlaupGanga; // samtals fjöldi km hlaup og ganga

    /**
     * Bætir hlaup við hlaupin og ganga við gengna km
     * @param hlaup hlaupnir km
     * @param ganga gengnir km
     * @return samtals hlaupnir og gengnir km
     */
    public int skraHreyfingu(String hlaup, String ganga) {
        this.hlaup += Integer.parseInt(hlaup);
        this.ganga += Integer.parseInt(ganga);
        this.hlaupGanga = this.hlaup + this.ganga;
        return hlaupGanga;
    }

    public int getHlaupSamtals() {
        return hlaup;
    }

    public int getGangaSamtals() {
        return ganga;
    }
}
