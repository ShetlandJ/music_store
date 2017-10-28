package myfirstgame.musicstore.Instruments.instruments.percussion;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;

/**
 * Created by James on 27/10/2017.
 */

public abstract class Percussion extends Instrument {

    private InstrumentType instrumentType;

    public Percussion(double buyPrice, double sellPrice, InstrumentType instrumentType) {
        super(buyPrice, sellPrice, instrumentType);
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }


}
