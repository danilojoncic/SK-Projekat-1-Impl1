package org.raf.pdf;

import model.boljeRijesenje.Dogadjaj;
import model.boljeRijesenje.Raspored;

public class Imp1Raspored {
    private Raspored raspored;

    public Imp1Raspored(Raspored raspored) {
        this.raspored = raspored;
        nejmarUPetercu();

    }

    private void nejmarUPetercu(){
        int index = 0;
        for (String s : raspored.getHeader().getStavkeDogadjaja()) {
            if(s.equalsIgnoreCase("Termin") || s.equalsIgnoreCase("DAN") || s.equalsIgnoreCase("Učionica")){
                index++;
                continue;
            }
            raspored.obrisiKolonu(index);
            index++;
        }
        raspored.refresh(raspored.getDogadjaji());
        //nakon ovoga s e trigeruje dodavanje datuma
    }


    // dan  ,  termin , datum , soba

}
