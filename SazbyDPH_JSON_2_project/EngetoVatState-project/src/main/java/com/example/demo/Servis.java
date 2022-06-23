package com.example.demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class Servis {

    private MapDphZeme mapDphZeme;
    private List<DPHZeme> listDphZeme;


    
    public MapDphZeme mapovaniDoObjektu (String body) throws JsonProcessingException {
        
        ObjectMapper objectMapper = new ObjectMapper();
        
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        mapDphZeme = objectMapper.readValue(body, MapDphZeme.class);

        mapDphZeme.getZemeMap().size();

        return mapDphZeme;
    }

   
    public List<DPHZeme> transformaceZHashNaArray() {
        listDphZeme = new ArrayList<>(mapDphZeme.getZemeMap().values());
        Collections.sort(listDphZeme);
        return listDphZeme;
    }
    
    public void exportDoSouboru (String filename)  throws VatException {
        try (PrintWriter writer = new PrintWriter(new FileOutputStream(filename))) {
            for (int i = 0; i < 3; i++) {
                writer.println(listDphZeme.get(i));
            }
            for (int i = listDphZeme.size() - 3; i < listDphZeme.size(); i++) {
                writer.println(listDphZeme.get(i));
            }
        } catch (FileNotFoundException e) {
            throw new VatException("");
        }
    }


}
