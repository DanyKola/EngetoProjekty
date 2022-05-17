package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;

public class MapDphZeme {


    @JsonProperty(value = "last_updated")
    private String lastUpdated;
    private String disclaimer;
    private Map<String, DPHZeme> zemeMap = new HashMap<>();


    public String getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(String lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public String getDisclaimer() {
        return disclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        this.disclaimer = disclaimer;
    }

    public Map<String, DPHZeme> getZemeMap() {
        return zemeMap;
    }

    public void setZemeMap(Map<String, DPHZeme> zemeMap) {
        this.zemeMap = zemeMap;
    }

    public void setRates(Map<String, DPHZeme> rates) {
        this.zemeMap = rates;
    }

}




