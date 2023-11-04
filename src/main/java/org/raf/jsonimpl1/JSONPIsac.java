package org.raf.jsonimpl1;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import model.boljeRijesenje.Dogadjaj;
import model.boljeRijesenje.Raspored;
import org.json.JSONArray;
import org.json.JSONObject;
import org.raf.csvimpl1.CSVCitac;

import java.io.*;
import java.lang.reflect.Type;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONPIsac {


    Raspored raspored;
    String filePath = "raspored.json";  // Replace with your file path
    Path path = Paths.get(filePath);



    public JSONPIsac(Raspored raspored) {
        this.raspored = raspored;

    }

    public void ispisiJSON(File file) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<String> header = raspored.getHeader().getStavkeDogadjaja();
        List<List<String>> listaDogadjaja = new ArrayList<>();
        listaDogadjaja.add(header);
        for (Dogadjaj dogadjaj : raspored.getDogadjaji()) {
            List<String> d = dogadjaj.getStavkeDogadjaja();
            listaDogadjaja.add(d);
        }

        objectMapper.writeValue(file,listaDogadjaja);

    }


//    public static void main(String[] args) throws IOException {
//        CSVCitac csvCitac = new CSVCitac();
//        Raspored raspored = csvCitac.citaj("C:\\Users\\jonci\\Desktop\\neBrisati.csv");
//        File file = new File("raspored.json");
//
//        JSONPIsac jsonpIsac = new JSONPIsac(raspored);
//        jsonpIsac.ispisiJSON(file);
//
//        for (Dogadjaj d : raspored.getDogadjaji()) {
//            System.out.println(d);
//        }
//
//    }




}
