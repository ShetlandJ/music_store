package myfirstgame.musicstore.Instruments;

import java.util.ArrayList;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;

/**
 * Created by James on 28/10/2017.
 */

public class Customer {

    private String name;
    private double cash;
    private InstrumentType favouriteInstrument;
    private String favBrand;
    private ArrayList<Instrument> instrumentBag;

    public Customer(String name, double cash, InstrumentType favouriteInstrument, String favBrand) {
        this.name = name;
        this.cash = cash;
        this.favouriteInstrument = favouriteInstrument;
        this.favBrand = favBrand;
        this.instrumentBag = new ArrayList<>();
    }

    public double getCash() {
        return cash;
    }

    public ArrayList<Instrument> getInstrumentBag() {
        return instrumentBag;
    }

    public InstrumentType getFavouriteInstrument() {
        return favouriteInstrument;
    }

    public String getFavBrand() {
        return favBrand;
    }

    public void changeCashLevel(double amount){
        this.cash += amount;
    }

}
