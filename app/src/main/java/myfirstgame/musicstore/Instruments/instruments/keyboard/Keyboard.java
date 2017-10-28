package myfirstgame.musicstore.Instruments.instruments.keyboard;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;

/**
 * Created by James on 27/10/2017.
 */

public abstract class Keyboard extends Instrument {

    private int numOfKeys;

    public Keyboard(double buyPrice, double sellPrice, InstrumentType instrumentType, int numOfKeys) {
        super(buyPrice, sellPrice, instrumentType);
        this.numOfKeys = numOfKeys;
    }

}
