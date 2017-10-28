package myfirstgame.musicstore;


import org.junit.Before;
import org.junit.Test;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.wind.Saxophone;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 27/10/2017.
 */

public class SaxophoneTest {

    Saxophone saxophone;

    @Before
    public void before(){
        saxophone = new Saxophone(100, 200, 5, "Alto");
    }

    @Test
    public void testHasReedQuality(){
        assertEquals(5, saxophone.getReedQuality());
    }

    @Test
    public void testHasType() {
        assertEquals("Alto", saxophone.getType());
    }

    @Test
    public void hasProfit(){
        assertEquals(100, saxophone.markUpMoney(), 0.01);
    }
}
