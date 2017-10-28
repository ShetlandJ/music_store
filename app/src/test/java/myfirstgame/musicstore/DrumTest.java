package myfirstgame.musicstore;

import org.junit.Before;
import org.junit.Test;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;
import myfirstgame.musicstore.Instruments.instruments.percussion.Drum;

import static org.junit.Assert.assertEquals;

/**
 * Created by James on 27/10/2017.
 */

public class DrumTest {
    Drum drum;

    @Before
    public void before() {
        drum = new Drum(400, 1000, 7, 2);
    }

    @Test
    public void fullKitSize() {
        assertEquals(9, drum.getDrumKitSize());
    }

    @Test
    public void hasProfit(){
        assertEquals(600, drum.markUpMoney(), 0.01);
    }
}
