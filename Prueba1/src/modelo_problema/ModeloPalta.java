/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo_problema;

import java.time.LocalDate;

/**
 *
 * @author souriez
 */
public class ModeloPalta implements Comparable<ModeloPalta> {
    
    public LocalDate date;
    public double averagePrice;
    public String type;
    public int year;
    public String region;

    public ModeloPalta(LocalDate date, double averagePrice, String type, int year, String region) {
        this.date = date;
        this.averagePrice = averagePrice;
        this.type = type;
        this.year = year;
        this.region = region;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(double averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    @Override
    public int compareTo(ModeloPalta o) {
        if(this.averagePrice>o.getAveragePrice()){
            return 1;
        }else if(this.averagePrice<o.getAveragePrice()){
            return -1;
        }else{
            return 0;
        }
//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString(){
        return this.date + "\t" + this.region + "\t" + this.type + "\t" + this.averagePrice;
    }
    
    
}
