package myfirstgame.musicstore.Instruments.instruments.stringed;


import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public class Guitar extends Stringed {

    String model;

    public Guitar(double buyPrice, double sellPrice, int strings, String model) {
        super(buyPrice, sellPrice, InstrumentType.GUITAR, strings);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Stairway: denied!";
    }


}


