package myfirstgame.musicstore.Instruments.instruments.percussion;

import myfirstgame.musicstore.Instruments.enums.InstrumentType;

/**
 * Created by James on 27/10/2017.
 */

public class Drum extends Percussion {
    int drumNum;
    int cymbalNum;

    public Drum(double buyPrice, double sellPrice, int drumNum, int cymbalNum) {
        super(buyPrice, sellPrice, InstrumentType.DRUM);
        this.drumNum = drumNum;
        this.cymbalNum = cymbalNum;
    }

    public int getDrumNum() {
        return drumNum;
    }

    public int getCymbalNum() {
        return cymbalNum;
    }

    public int getDrumKitSize(){
        return drumNum + cymbalNum;
    }

    public void setDrumNum(int drumNum) {
        this.drumNum = drumNum;
    }

    public void setCymbalNum(int cymbalNum) {
        this.cymbalNum = cymbalNum;
    }

    public String play(){
        return "whomp whomp whomp";
    }


}
