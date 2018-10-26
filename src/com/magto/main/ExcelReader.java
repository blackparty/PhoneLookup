/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magto.main;

import com.magto.entities.Response;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author MimiKuchiki
 */
public class ExcelReader {

    private Response response;

    public ExcelReader() {
    }

    Map<String,String> startReadingNumbers(String filePath) {
        Map<String,String> map = new HashMap<String,String>();
        int count = 0;
        String line = "";
        String csvSplitBy = ",";
        try {
            File file = new File(filePath);
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            while ((line = br.readLine()) != null) {
                if (count == 0) {
                    count++;
                    continue;
                }
                String[] a = line.split(csvSplitBy);
                String phoneNumber = a[2];
                if(!map.containsKey(phoneNumber)){
                    map.put(phoneNumber, phoneNumber);
                    count++;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("Number of Phone Numbers gathered: "+count);
        return map;
    }

}
