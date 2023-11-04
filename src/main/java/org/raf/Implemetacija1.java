package org.raf;

import com.google.common.io.Files;
import model.Specifikacija;
import model.boljeRijesenje.Raspored;
import org.raf.csvimpl1.CSVCitac;
import org.raf.jsonimpl1.JSONCitac;


import java.io.IOException;

public class Implemetacija1 implements Specifikacija {

    private Raspored raspored;

    public Implemetacija1() {

    }

    @Override
    public void stampaj() {

        StampacKonzola stampacKonzola = new StampacKonzola(raspored);
        stampacKonzola.stampajSadrzajHashMape();
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
        }else if(Files.getFileExtension(s).equalsIgnoreCase("json")){
            JSONCitac  jsonCitac = new JSONCitac();
            try {
                raspored = jsonCitac.procitajJSON(s);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
