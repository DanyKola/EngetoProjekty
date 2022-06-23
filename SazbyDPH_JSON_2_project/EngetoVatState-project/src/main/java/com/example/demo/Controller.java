package com.example.demo;

import org.json.JSONException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class Controller {
     String vypisZeme;
     String  vypisTriMinZeme;
     String vypisTriMaxZeme;

     String vypisZameCelkem = "";
     String  vypisTriMinZemeCelkem = "";
     String vypisTriMaxZemeCelkem = "";

     Servis servis = new Servis();
     public Controller() throws JSONException, IOException, InterruptedException {
          this.spoustec();
     }

     private void spoustec() throws JSONException, IOException, InterruptedException {

          ZavolaniAppi Appi = new ZavolaniAppi();
          String body = Appi.zavolejAppi();
          servis = new Servis();
          servis.mapovaniDoObjektu(body);
          servis.transformaceZHashNaArray();
     }


     @GetMapping(path = "/vypisVsechnyZeme")
     public String najdiVsechnyZeme()  {
          for ( int i=0; i<servis.transformaceZHashNaArray().size(); i++) {
               vypisZeme = servis.transformaceZHashNaArray().get(i).toString();
               vypisZameCelkem += vypisZeme + "\n";
          }
          return "Výpis objektů - všechny země: " +"\n"
                    + vypisZameCelkem;
     }

   
     @GetMapping(path = "/vypisTriZemeMinDph")
     public String najdiTriZemeMinDPH() {
          for (int i = 0; i < 3; i++) {
               vypisTriMinZeme = servis.transformaceZHashNaArray().get(i).toString();
               vypisTriMinZemeCelkem +=  vypisTriMinZeme + "\n";
          }
          return "Země se 3 nejnižšími hodnotami DPH: " +"\n"
                  + vypisTriMinZemeCelkem;
     }


     @GetMapping(path = "/vypisTriZemeMaxDph")
     public String  najdiTriZemeMaxDPH()  {
          for ( int i= servis.transformaceZHashNaArray().size()-3; i<servis.transformaceZHashNaArray().size(); i++) {
               vypisTriMaxZeme = servis.transformaceZHashNaArray().get(i).toString();
               vypisTriMaxZemeCelkem += vypisTriMaxZeme + "\n";
          }
          return "Země se 3 nejnižšími hodnotami DPH: "
                  +"\n" + vypisTriMaxZemeCelkem;
     }
}
