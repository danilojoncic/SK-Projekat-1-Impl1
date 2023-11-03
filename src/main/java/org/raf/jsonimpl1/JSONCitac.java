package org.raf.jsonimpl1;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import model.boljeRijesenje.Dogadjaj;
import model.boljeRijesenje.Raspored;
import org.raf.csvimpl1.CSVPisac;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class JSONCitac {
    public static void main(String[] args) {
        ObjectMapper mapper = new ObjectMapper();

        try {
            File file = new File("raspored.json"); // Ime JSON datoteke koju želite učitati

            Raspored raspored = mapper.readValue(file,Raspored.class);





            CSVPisac csvPisac = new CSVPisac();
            csvPisac.napisi(raspored);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
