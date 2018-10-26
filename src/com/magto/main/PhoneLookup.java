/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magto.main;

import com.magto.entities.Response;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.magto.entities.BelongsTo;
import com.magto.jdbc.ResponseDBC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



/**
 *
 * @author MimiKuchiki
 */
public class PhoneLookup {

    public PhoneLookup() {
    }

    boolean start(String request) {
        String phoneNumber = "";
        try {
            ResponseDBC rDBC = new ResponseDBC();
           // for (Map.Entry<String, String> e : map.entrySet()) {

                //System.out.println(">> " + e.getValue());
                //phoneNumber = e.getValue();
                
                URL url = new URL(request + phoneNumber);
                HttpURLConnection con = (HttpURLConnection) url.openConnection();
                con.setRequestMethod("GET");

                int status = con.getResponseCode();
                
                BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
                String inputLine;
                StringBuffer content = new StringBuffer();
                while ((inputLine = br.readLine()) != null) {
                    content.append(inputLine);
                }
                br.close();
                con.disconnect();

                Gson g = new Gson();
                BelongsTo bt = new BelongsTo();
                
             Response ar = g.fromJson(content.toString(), Response.class);
                
                
                
//                if(Boolean.parseBoolean(ar.isValid())){
//                    bt = g.fromJson(content.toString(),BelongsTo.class);
//                }
                
                
                System.out.println("from content stringbuffer: \n"+content);
                System.out.println("From Response Object: \n"+ar.toString());
                System.out.println("From belongsto object: \n"+bt.toString());
                //add to postgres database
                boolean flag = rDBC.addResponse(ar);
            //}

        } catch (Exception e) {
            e.printStackTrace();
        }
        return true;
    }
}
