package com.example.demo;

import java.io.IOException;

public class MainConsole {

    public static final String TOP_MAX_MIN_DPH_STATES = "top-max-min-dph.txt";

    public static void main(String[] args) throws IOException, InterruptedException {

//Vypsání souboru do konzole
        //vytvoření instance třídy Zavolání Appi
        ZavolaniAppi appi = new ZavolaniAppi();
        // zavolání metody zavolejAppi
        String body = appi.zavolejAppi();

        Servis servis = new Servis();
        servis.mapovaniDoObjektu(body);

        System.out.println();

//Vypsání objektů do konzole
        System.out.println("Výpis objektů - všechny země:");
        System.out.println("------------------------");
        for (int i = 0; i < servis.transformaceZHashNaArray().size(); i++) {
            System.out.println(servis.transformaceZHashNaArray().get(i));
        }
        System.out.println();


        System.out.println("Země se 3 nejnižšími hodnotami DPH: ");
        System.out.println("------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println(servis.transformaceZHashNaArray().get(i));
        }
        System.out.println();

        System.out.println("Země se 3 nevyššími hodnotami DPH: ");
        System.out.println("------------------------");
        for (int i = servis.transformaceZHashNaArray().size() - 3; i < servis.transformaceZHashNaArray().size(); i++) {
            System.out.println(servis.transformaceZHashNaArray().get(i));
        }


//Vložení do souboru
            try {
                servis.exportDoSouboru(TOP_MAX_MIN_DPH_STATES);
            } catch (VatException e) {
                e.printStackTrace();
            }
        }
}
