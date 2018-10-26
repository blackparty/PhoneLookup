/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.magto.entities;

/**
 *
 * @author MimiKuchiki
 */
public class Response {
    private String is_valid;
    private String number;
    private String local_format;
    private String international_format;
    private String country_prefix;
    private String country_code;
    private String country_name;
    private String location;
    private String carrier;
    private String line_type;
    private BelongsTo belongs_to;
    public Response() {
    }

    public Response(String is_valid, String number, String local_format, String international_format, String country_prefix, String country_code, String country_name, String location, String carrier, String line_type, BelongsTo belongs_to) {
        this.is_valid = is_valid;
        this.number = number;
        this.local_format = local_format;
        this.international_format = international_format;
        this.country_prefix = country_prefix;
        this.country_code = country_code;
        this.country_name = country_name;
        this.location = location;
        this.carrier = carrier;
        this.line_type = line_type;
        this.belongs_to = belongs_to;
    }
    
    public String isValid(){
        return getIs_valid();
    }
    public void setValid(String isValid){
        this.setIs_valid(isValid);
    }
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocalFormat() {
        return getLocal_format();
    }

    public void setLocalFormat(String localFormat) {
        this.setLocal_format(localFormat);
    }

    public String getInternationalFormat() {
        return getInternational_format();
    }

    public void setInternationalFormat(String internationalFormat) {
        this.setInternational_format(internationalFormat);
    }

    public String getCountryPrefix() {
        return getCountry_prefix();
    }

    public void setCountryPrefix(String countryPrefix) {
        this.setCountry_prefix(countryPrefix);
    }

    public String getCountryCode() {
        return getCountry_code();
    }

    public void setCountryCode(String countryCode) {
        this.setCountry_code(countryCode);
    }

    public String getCountryName() {
        return getCountry_name();
    }

    public void setCountryName(String countryName) {
        this.setCountry_name(countryName);
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getLineType() {
        return getLine_type();
    }

    public void setLineType(String lineType) {
        this.setLine_type(lineType);
    }

    @Override
    public String toString() {
        return "Response{" + "number=" + getNumber() + ", localFormat=" + getLocal_format() + ", internationalFormat=" + getInternational_format() + ", countryPrefix=" + getCountry_prefix() + ", countryCode=" + getCountry_code() + ", countryName=" + getCountry_name() + ", location=" + getLocation() + ", carrier=" + getCarrier() + ", lineType=" + getLine_type() + '}';
    }

    public BelongsTo getBelongs_to() {
        return belongs_to;
    }

    public void setBelongs_to(BelongsTo belongs_to) {
        this.belongs_to = belongs_to;
    }

    /**
     * @return the is_valid
     */
    public String getIs_valid() {
        return is_valid;
    }

    /**
     * @param is_valid the is_valid to set
     */
    public void setIs_valid(String is_valid) {
        this.is_valid = is_valid;
    }

    /**
     * @return the local_format
     */
    public String getLocal_format() {
        return local_format;
    }

    /**
     * @param local_format the local_format to set
     */
    public void setLocal_format(String local_format) {
        this.local_format = local_format;
    }

    /**
     * @return the international_format
     */
    public String getInternational_format() {
        return international_format;
    }

    /**
     * @param international_format the international_format to set
     */
    public void setInternational_format(String international_format) {
        this.international_format = international_format;
    }

    /**
     * @return the country_prefix
     */
    public String getCountry_prefix() {
        return country_prefix;
    }

    /**
     * @param country_prefix the country_prefix to set
     */
    public void setCountry_prefix(String country_prefix) {
        this.country_prefix = country_prefix;
    }

    /**
     * @return the country_code
     */
    public String getCountry_code() {
        return country_code;
    }

    /**
     * @param country_code the country_code to set
     */
    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    /**
     * @return the country_name
     */
    public String getCountry_name() {
        return country_name;
    }

    /**
     * @param country_name the country_name to set
     */
    public void setCountry_name(String country_name) {
        this.country_name = country_name;
    }

    /**
     * @return the line_type
     */
    public String getLine_type() {
        return line_type;
    }

    /**
     * @param line_type the line_type to set
     */
    public void setLine_type(String line_type) {
        this.line_type = line_type;
    }

}
