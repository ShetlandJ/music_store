package myfirstgame.musicstore;

import org.junit.Before;
import org.junit.Test;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.stringed.Guitar;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 27/10/2017.
 */

public class GuitarTest {

    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(500, 750, 6, "Ibanez");
    }

    @Test
    public void getStrings() {
        assertEquals(6, guitar.getStrings());
    }

    @Test
    public void setStrings(){
        Guitar newGuitar = new Guitar(500, 750, 6, "Ibanez");
        newGuitar.setStrings(7);
        assertEquals(7, newGuitar.getStrings());
    }

    @Test
    public void hasProfit(){
        assertEquals(250, guitar.markUpMoney(), 0.01);
    }

    @Test
    public void guitarHasType(){
        assertEquals(InstrumentType.GUITAR, guitar.getInstrumentType());
    }

}
