package myfirstgame.musicstore.Instruments.instruments.wind;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;

/**
 * Created by James on 27/10/2017.
 */

public abstract class Wind extends Instrument {

    int reedQuality;


    public Wind(double buyPrice, double sellPrice, InstrumentType instrumentType, int reedQuality) {
        super(buyPrice, sellPrice, instrumentType);
        this.reedQuality = reedQuality;
    }

    public int getReedQuality() {
        return reedQuality;
    }

}
