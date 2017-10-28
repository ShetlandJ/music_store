package myfirstgame.musicstore.Instruments.instruments.keyboard;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public class Organ extends Keyboard {

    public Organ(double buyPrice, double sellPrice, int numOfKeys) {
        super(buyPrice, sellPrice, InstrumentType.ORGAN, numOfKeys);
    }

    public String play(){
        return "Organ sounds, I guess";
    }
}
