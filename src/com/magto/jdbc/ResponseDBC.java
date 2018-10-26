/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magto.jdbc;


import java.sql.*;
import com.magto.entities.Response;

/**
 *
 * @author MimiKuchiki
 */
public class ResponseDBC {
    private Connection connection;
    private ResultSet result;
    private PreparedStatement ps;
    private Statement statement;

    public ResponseDBC(){
        try{
            Class.forName("org.postgresql.Driver");
            this.connection = DriverManager.getConnection("jdbc:postgresql://appserver.payruler.com:8053/phonelookup","postgres","");
            statement = connection.createStatement();
            String createResponseTable = "create table if not exists response("
                    + "number serial,"
                    + "local_format varchar(20),"
                    + "international_format varchar(20),"
                    + "country_prefix varchar(20),"
                    + "country_name varchar(50),"
                    + "country_code varchar(20),"
                    + "location varchar(50),"
                    + "carrier varchar(50),"
                    + "line_type varchar(50)) ";
            statement.execute(createResponseTable);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    
    public boolean addResponse(Response response){
        try{
            String command = "insert into response("
                    + "local_format,"
                    + "international_format,"
                    + "country_prefix,"
                    + "country_name,"
                    + "country_code,"
                    + "location,carrier,"
                    + "line_type) "
                    + "values (?,?,?,?,?,?,?,?)";
            ps = connection.prepareStatement(command);
            ps.setString(1, response.getLocalFormat());
            ps.setString(2, response.getInternationalFormat());
            ps.setString(3, response.getCountryPrefix());
            ps.setString(4, response.getCountryName());
            ps.setString(5, response.getCountryCode());
            ps.setString(6, response.getLocation());
            ps.setString(7, response.getCarrier());
            ps.setString(8,response.getLineType());
            ps.execute();
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }
        return true;
    }
    
}
