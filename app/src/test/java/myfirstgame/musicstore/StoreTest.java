package myfirstgame.musicstore;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import myfirstgame.musicstore.Instruments.Customer;
import myfirstgame.musicstore.Instruments.Store;
import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;
import myfirstgame.musicstore.Instruments.instruments.keyboard.Organ;
import myfirstgame.musicstore.Instruments.instruments.keyboard.Piano;
import myfirstgame.musicstore.Instruments.instruments.percussion.Drum;
import myfirstgame.musicstore.Instruments.instruments.stringed.Bass;
import myfirstgame.musicstore.Instruments.instruments.stringed.Guitar;
import myfirstgame.musicstore.Instruments.instruments.wind.Flute;
import myfirstgame.musicstore.Instruments.instruments.wind.Saxophone;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 27/10/2017.
 */

public class StoreTest {

    Store store;
    Guitar guitar;
    Bass bassGuitar;
    Drum drum;
    Saxophone saxophone;
    Flute flute;
    Organ organ;
    Piano piano;
    Customer customer;

    ArrayList<Instrument> instruments;
    ArrayList<Instrument> customerInstruments;


    @Before
    public void before() {
        customerInstruments = new ArrayList<>();
        customer = new Customer("James", 100, InstrumentType.BASS, "Stagg");
        guitar = new Guitar(100, 200, 6, "Pacifica");
        bassGuitar = new Bass(100, 250, 4, "Stagg");
        drum = new Drum(400, 1000, 7, 2);
        saxophone = new Saxophone(250, 500, 5, "Alto");
        flute = new Flute(50, 99, 3, "Piccolo");
        organ = new Organ(500, 750, 50);
        piano = new Piano(1000, 2500, 50);

        instruments = new ArrayList<>();
        store = new Store("Steve's Music Exchange", instruments);
    }

    @Test
    public void stockCountIsZero() {
        assertEquals(0, store.getStockSize());
    }

    @Test
    public void itemCanBeAddedToStock(){
        store.addItemToStock(guitar);
        assertEquals(1, store.getStockSize());
    }

    @Test
    public void itemCanBeRemovedToStock(){
        store.addItemToStock(guitar);
        store.addItemToStock(guitar);
        store.addItemToStock(bassGuitar);
        store.removeItemFromStock(guitar);
        assertEquals(2, store.getStockSize());
    }

    @Test
    public void valueOfStock(){
        store.addItemToStock(guitar);
        store.addItemToStock(bassGuitar);
        store.addItemToStock(drum);
        store.addItemToStock(saxophone);
        store.addItemToStock(flute);
        store.addItemToStock(organ);
        store.addItemToStock(piano);
        assertEquals(2400, store.getStockValue(), 0.01);
    }

    @Test
    public void potentialSalesValue(){
        store.addItemToStock(guitar);
        store.addItemToStock(bassGuitar);
        store.addItemToStock(drum);
        store.addItemToStock(saxophone);
        store.addItemToStock(flute);
        store.addItemToStock(organ);
        store.addItemToStock(piano);
        assertEquals(5299, store.getSalesValue(), 0.01);
    }

    @Test
    public void customerCanBuyItem(){
        Customer testCustomer = new Customer("James", 260, InstrumentType.BASS, "Stagg");
        store.addItemToStock(bassGuitar);
        store.sellItemToCustomer(testCustomer);
        assertEquals(1, testCustomer.getInstrumentBag().size());
    }

    @Test
    public void customerCantBuyItem(){
        Customer testCustomer = new Customer("James", 240, InstrumentType.BASS, "Stagg");
        store.addItemToStock(bassGuitar);
        store.sellItemToCustomer(testCustomer);
        assertEquals(0, testCustomer.getInstrumentBag().size());
    }
}

