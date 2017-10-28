package myfirstgame.musicstore.Instruments;

import java.util.ArrayList;

import myfirstgame.musicstore.Instruments.instruments.Instrument;

/**
 * Created by James on 27/10/2017.
 */

public class Store {

    String name;
    ArrayList<Instrument> instruments;

    public Store(String name, ArrayList<Instrument> instruments) {
        this.name = name;
        this.instruments = instruments;
    }

    public int getStockSize() {
        return instruments.size();
    }

    public void setInstruments(ArrayList<Instrument> instruments) {
        this.instruments = instruments;
    }

    public void addItemToStock(Instrument instrument) {
        instruments.add(instrument);
    }

    public void removeItemFromStock(Instrument instrument) {
        instruments.remove(instrument);
    }

    public double getStockValue() {
        int totalStockValue = 0;
        for (Instrument instrument : instruments) {
            totalStockValue += instrument.getBuyPrice();
        }
        return totalStockValue;
    }

    public double getSalesValue() {
        int totalSaleValue = 0;
        for (Instrument instrument : instruments) {
            totalSaleValue += instrument.getSellPrice();
        }
        return totalSaleValue;
    }

    public void sellItemToCustomer(Customer customer) {
        for (Instrument instrument : instruments) {
            if ((instrument.getInstrumentType() == customer.getFavouriteInstrument()) && customer.getCash() >= instrument.getSellPrice()) {
                {
                    customer.getInstrumentBag().add(instrument);
                }
            }
        }
    }
}
