package myfirstgame.musicstore.Instruments.instruments;

import myfirstgame.musicstore.Instruments.behaviours.Playable;
import myfirstgame.musicstore.Instruments.behaviours.Sellable;
import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    private double buyPrice;
    private double sellPrice;
    private InstrumentType instrumentType;

    public Instrument(double buyPrice, double sellPrice, InstrumentType instrumentType) {
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.instrumentType = instrumentType;
    }

    public double getBuyPrice() {
        return buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setBuyPrice(int buyPrice) {
        if (buyPrice >= 0) {
            this.buyPrice = buyPrice;
        }
    }

    public void setSellPrice(int sellPrice) {
        if (sellPrice >= 0) {
            this.sellPrice = sellPrice;
        }
    }

    public double markUpMoney(){
        return this.getSellPrice() - this.getBuyPrice();
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

}

