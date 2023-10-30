package org.raf;

import model.boljeRijesenje.Dogadjaj;
import model.boljeRijesenje.Raspored;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {
        CSVCitac csvCitac = new CSVCitac();
        Raspored raspored = csvCitac.citaj("C:\\Users\\jonci\\Desktop\\neBrisati.csv");
        JSONPIsac jsonpIsac = new JSONPIsac();
        jsonpIsac.napisiJSON(raspored);
        /*
        Dogadjaj header = new Dogadjaj(new ArrayList<String>());
        header.getStavkeDogadjaja().add("Predmeti");
        header.getStavkeDogadjaja().add("Dani");
        header.getStavkeDogadjaja().add("Ucionice");
        header.getStavkeDogadjaja().add("Profesori");
        header.getStavkeDogadjaja().add("vrijeme");
        header.getStavkeDogadjaja().add("tip");



        Dogadjaj dogadjaj1 = new Dogadjaj(new ArrayList<String>());
        dogadjaj1.getStavkeDogadjaja().add("LAAG");
        dogadjaj1.getStavkeDogadjaja().add("PON");
        dogadjaj1.getStavkeDogadjaja().add("RAF 5");
        dogadjaj1.getStavkeDogadjaja().add("Milanka");
        dogadjaj1.getStavkeDogadjaja().add("Ujutro");
        dogadjaj1.getStavkeDogadjaja().add("Predavanje");

        Dogadjaj dogadjaj2 = new Dogadjaj(new ArrayList<String>());
        dogadjaj2.getStavkeDogadjaja().add("Skript");
        dogadjaj2.getStavkeDogadjaja().add("UTO");
        dogadjaj2.getStavkeDogadjaja().add("RAF1");
        dogadjaj2.getStavkeDogadjaja().add("Milance");
        dogadjaj2.getStavkeDogadjaja().add("Vecera");
        dogadjaj2.getStavkeDogadjaja().add("Vjezbe");

        List<Dogadjaj> dogadjajs = new ArrayList<>();
        dogadjajs.add(header);
        dogadjajs.add(dogadjaj1);
        dogadjajs.add(dogadjaj2);

        Raspored raspored = csvCitac.refreshRaspored(dogadjajs);
        for(HashMap<String,List<Dogadjaj>> hm : raspored.getBozePomozi()){
            for (String s : hm.keySet()) {
                System.out.println(s);
                Dogadjaj dogadjaj = hm.get(s).get(0);
                System.out.println(dogadjaj);

            }
        }
        raspored = csvCitac.refreshRaspored(raspored.getDogadjaji());
        */
        //Implemetacija1 implemetacija1 = new Implemetacija1();

        //implemetacija1.ucitajRaspored("D:\\Racunarski Fakultet Beograd\\Treca Godina\\5. Semestar\\Softverske komponente\\src\\main\\resources\\csv.csv");
        //implemetacija1.stampaj();
    }
}
