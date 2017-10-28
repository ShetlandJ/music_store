package myfirstgame.musicstore;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import myfirstgame.musicstore.Instruments.Customer;
import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.Instrument;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 28/10/2017.
 */

public class CustomerTest {

    ArrayList<Instrument> instruments;
    Customer customer;

    @Before
    public void before(){
        customer = new Customer("James", 1500.0, InstrumentType.BASS, "Stagg");
    }

    @Test
    public void customerCashLevelCanChange(){
        customer.changeCashLevel(50.0);
        assertEquals(1550.0, customer.getCash(), 0.01);
    }



}
