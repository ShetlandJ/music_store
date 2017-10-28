package myfirstgame.musicstore.Instruments.instruments.stringed;


import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public class Bass extends Stringed {
    private String model;

    public Bass(double buyPrice, double sellPrice, int strings, String model) {
        super(buyPrice, sellPrice, InstrumentType.BASS, strings);
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String play(){
        return "Bwomp bwomp pop!";
    }
}
