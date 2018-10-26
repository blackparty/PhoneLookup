/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magto.main;


import com.google.gson.Gson;
import com.magto.jdbc.ResponseDBC;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.Map;


/**
 *
 * @author MimiKuchiki
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String filePath = "D:\\Our_Files1\\Eric\\Work\\PayRuler\\PhoneLookup\\outbound_calls.csv";
        String phoneNumber = "19548156467";
       
        //numverify details
        //String key = "68f928487d3c357cd7ca860e79683c7b";
        //String request = "http://apilayer.net/api/validate?access_key="+key+"&number=";
        
        
        
        //whitepages pro details
        String key="b5db4cef6bc44fd2adf8ea073a659879";
        String request="https://proapi.whitepages.com/3.0/phone.json?api_key="+key+"&phone="+phoneNumber;
        
        try{
            
            
            ResponseDBC r = new ResponseDBC();
            //reading all number on the excel file
            ExcelReader er = new ExcelReader();
            //Map<String,String> map = er.startReadingNumbers(filePath);
           
            //display all numbers            
//            for(Map.Entry<String,String> e:map.entrySet()){
//                System.out.println(">> "+e.getValue());
//            }
//            
            PhoneLookup nv = new PhoneLookup();
            nv.start(request);
            
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
}
