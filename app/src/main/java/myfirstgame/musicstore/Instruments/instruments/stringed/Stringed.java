package myfirstgame.musicstore.Instruments.instruments.stringed;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;

/**
 * Created by James on 27/10/2017.
 */

public abstract class Stringed extends Instrument {

    private int strings;

    public Stringed(double buyPrice, double sellPrice, InstrumentType instrumentType, int strings) {
        super(buyPrice, sellPrice, instrumentType);
        this.strings = strings;
    }

    public int getStrings() {
        return strings;
    }

    public void setStrings(int strings) {
        this.strings = strings;
    }

}
