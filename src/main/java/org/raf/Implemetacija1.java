package org.raf;

import com.google.common.io.Files;
import model.Specifikacija;
import model.boljeRijesenje.Raspored;


import java.io.IOException;

public class Implemetacija1 implements Specifikacija {

    private Raspored raspored;

    public Implemetacija1() {

    }

    @Override
    public void stampaj() {

        StampacKonzola stampacKonzola = new StampacKonzola(raspored);
        stampacKonzola.stampajImp1();
    }

    @Override
    public void kreirajRaspored() {

    }

    @Override
    public void pretraziRaspred() {

    }

    @Override
    public void sacuvajRaspored() {

    }

    @Override
    public void ucitajRaspored(String s){
        String[] extensionCheck = s.split("\\.");
        if(Files.getFileExtension(s).equalsIgnoreCase("csv")){ // najjaca biblioteka bayo Guava firmetina
            CSVCitac csvCitac = new CSVCitac();
            try {
               raspored =  csvCitac.citaj(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }

        }

    }




}
