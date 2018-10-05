/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirequest;


import com.google.gson.Gson;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;


/**
 *
 * @author MimiKuchiki
 */
public class ApiRequest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String phoneNumber = "19548156467";
        String request = "http://apilayer.net/api/validate?access_key=b21193687ee114204b7940bd83573160&number=";
        try{
            URL url = new URL(request+phoneNumber);
            HttpURLConnection con  = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            
            int status = con.getResponseCode();
            BufferedReader br = new BufferedReader(new InputStreamReader(con.getInputStream()));
            String inputLine;
            StringBuffer content = new StringBuffer();
            while((inputLine = br.readLine())!=null){
                content.append(inputLine);
            }
            br.close();
            con.disconnect();
            Gson g = new Gson();
            Response ar = g.fromJson(content.toString(), Response.class);
            System.out.println(ar.toString());
            
            System.out.println(content);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
