package myfirstgame.musicstore.Instruments.instruments.keyboard;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public class Piano extends Keyboard {
    public Piano(double buyPrice, double sellPrice, int numOfKeys) {
        super(buyPrice, sellPrice, InstrumentType.PIANO, numOfKeys);
    }

    public String play(){
        return "Jingle jangle";
    }
}
