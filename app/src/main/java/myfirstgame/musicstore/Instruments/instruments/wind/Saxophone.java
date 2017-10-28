package myfirstgame.musicstore.Instruments.instruments.wind;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public class Saxophone extends Wind {

    String type;

    public Saxophone(double buyPrice, double sellPrice, int reedQuality, String type) {
        super(buyPrice, sellPrice, InstrumentType.SAXOPHONE, reedQuality);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public String play(){
        return "doot doot";
    }
}
