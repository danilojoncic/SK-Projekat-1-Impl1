package org.raf;

import com.google.common.io.Files;
import model.Specifikacija;
import model.boljeRijesenje.Raspored;
import org.raf.csvimpl1.CSVCitac;
import org.raf.csvimpl1.CSVPisac;
import org.raf.jsonimpl1.JSONCitac;
import org.raf.jsonimpl1.JSONPIsac;


import java.io.File;
import java.io.IOException;
import java.util.List;

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
    public void kreirajRaspored(String filename,String type) {
        if(type.equalsIgnoreCase("csv")){
            List<String> header = this.raspored.getHeader().getStavkeDogadjaja();
            String[] kolone = new String[header.size()];
            CSVPisac csvPisac = new CSVPisac();
            csvPisac.napisi(raspored);
        }else if(type.equalsIgnoreCase("pdf")){

        }else if(type.equalsIgnoreCase("json")){
            JSONPIsac jsonpIsac = new JSONPIsac(this.raspored);
            File file = new File( filename +".json");
            try {
                jsonpIsac.ispisiJSON(file);
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        }
    }

    @Override
    public void pretraziRaspred() {

    }

    @Override
    public void sacuvajRaspored() {

    }

    public Raspored getRaspored() {
        return raspored;
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



    public void setRaspored(Raspored raspored) {
        this.raspored = raspored;
    }
}
