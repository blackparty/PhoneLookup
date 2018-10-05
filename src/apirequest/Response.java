/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apirequest;

/**
 *
 * @author MimiKuchiki
 */
public class Response {
    private boolean valid;
    private String number;
    private String localFormat;
    private String internationalFormat;
    private String countryPrefix;
    private String countryCode;
    private String countryName;
    private String location;
    private String carrier;
    private String lineType;
    
    public Response(){}

    public Response(boolean valid, String number, String localFormat, String internationalFormat, String countryPrefix, String countryCode, String countryName, String location, String carrier, String lineType) {
        this.valid = valid;
        this.number = number;
        this.localFormat = localFormat;
        this.internationalFormat = internationalFormat;
        this.countryPrefix = countryPrefix;
        this.countryCode = countryCode;
        this.countryName = countryName;
        this.location = location;
        this.carrier = carrier;
        this.lineType = lineType;
    }

    public boolean isValid() {
        return valid;
    }

    public void setValid(boolean valid) {
        this.valid = valid;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getLocalFormat() {
        return localFormat;
    }

    public void setLocalFormat(String localFormat) {
        this.localFormat = localFormat;
    }

    public String getInternationalFormat() {
        return internationalFormat;
    }

    public void setInternationalFormat(String internationalFormat) {
        this.internationalFormat = internationalFormat;
    }

    public String getCountryPrefix() {
        return countryPrefix;
    }

    public void setCountryPrefix(String countryPrefix) {
        this.countryPrefix = countryPrefix;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
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
        return lineType;
    }

    public void setLineType(String lineType) {
        this.lineType = lineType;
    }

    @Override
    public String toString() {
        return "Response{" + "valid=" + valid + ", number=" + number + ", localFormat=" + localFormat + ", internationalFormat=" + internationalFormat + ", countryPrefix=" + countryPrefix + ", countryCode=" + countryCode + ", countryName=" + countryName + ", location=" + location + ", carrier=" + carrier + ", lineType=" + lineType + '}';
    }
    
    
    
}
