package org.raf.jsonimpl1;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.boljeRijesenje.Dogadjaj;
import model.boljeRijesenje.Raspored;
import org.json.JSONArray;
import org.json.JSONObject;
import org.raf.csvimpl1.CSVCitac;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JSONPIsac {





    public JSONPIsac() {

    }

    public static void main(String[] args) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        CSVCitac csvCitac = new CSVCitac();
        Raspored raspored = csvCitac.citaj("C:\\Users\\Korisnik\\Desktop\\csv.csv");
//        String json = mapper.writeValueAsString(raspored);

        File file = new File("raspored.json");
        mapper.writeValue(file,raspored.getDogadjaji());

    }
    public void napisiJSON(Raspored raspored){

    }


//    public void napisiJSON(Raspored raspored){
//
//
//        List<JSONArray> nizJsona = new ArrayList<>();
//        List<Dogadjaj> dogadjaji = raspored.getDogadjaji();
//        for (Dogadjaj dogadjaj : dogadjaji) {
//            JSONArray jsonArray = new JSONArray();
//            for(String string : dogadjaj.getStavkeDogadjaja()){
//                jsonArray.put(string);
//            }
//            nizJsona.add(jsonArray);
//        }
//        String filePath = "output.json";
//
//        try {
//            FileWriter fileWriter = new FileWriter(filePath);
//            for(JSONArray jsonArray : nizJsona){
//                System.out.println(jsonArray.toString(4));
//                fileWriter.write(jsonArray.toString(1));
//                //fileWriter.write(jsonArray.toString(4));
//            }
//            fileWriter.close();
//            System.out.println("JSON data has been written to " + filePath);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }

}
