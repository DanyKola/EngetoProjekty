package com.example.demo;

import com.fasterxml.jackson.annotation.JsonProperty;


public class DPHZeme implements Comparable<DPHZeme>{

    private String country;

    @JsonProperty(value = "standard_rate")
    private Double standardRate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Double getStandardRate() {
        return standardRate;
    }

    public void setStandardRate(Double standardRate) {
        this.standardRate = standardRate;
    }

    @Override
    public String toString() {
        return  getCountry()+ " ........... DPH = " + getStandardRate();
    }

    @Override
    public int compareTo(DPHZeme o) {
        return (int) (this.standardRate - o.getStandardRate());
    }
}
