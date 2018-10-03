/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author souriez
 */
public class Aeropuerto implements Comparable<Aeropuerto>{
    
    private int airportID;
    private String nombre;
    private String ciudad;
    private String pais;
    private String IATA;
    private String ICAO;
    private double latitud;
    private double longitud;
    private double altitud;
    private String zonaHoraria;
    private String DST; //Dayligth savings time.
    private String zonaHorariaTZ;
    private String tipoAeropuerto;
    private String source;

    public Aeropuerto(int airportID, String nombre, String ciudad, String pais, String IATA, String ICAO, double latitud, double longitud, double altitud, String zonaHoraria, String DST, String zonaHorariaTZ, String tipoAeropuerto, String source) {
        this.airportID = airportID;
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.pais = pais;
        this.IATA = IATA;
        this.ICAO = ICAO;
        this.latitud = latitud;
        this.longitud = longitud;
        this.altitud = altitud;
        this.zonaHoraria = zonaHoraria;
        this.DST = DST;
        this.zonaHorariaTZ = zonaHorariaTZ;
        this.tipoAeropuerto = tipoAeropuerto;
        this.source = source;
    }
    
    /*public Aeropuerto(){
        
    }*/

    public int getAirportID() {
        return airportID;
    }

    public void setAirportID(int airportID) {
        this.airportID = airportID;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getIATA() {
        return IATA;
    }

    public void setIATA(String IATA) {
        this.IATA = IATA;
    }

    public String getICAO() {
        return ICAO;
    }

    public void setICAO(String ICAO) {
        this.ICAO = ICAO;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public double getAltitud() {
        return altitud;
    }

    public void setAltitud(double altitud) {
        this.altitud = altitud;
    }

    public String getZonaHoraria() {
        return zonaHoraria;
    }

    public void setZonaHoraria(String zonaHoraria) {
        this.zonaHoraria = zonaHoraria;
    }

    public String getDST() {
        return DST;
    }

    public void setDST(String DST) {
        this.DST = DST;
    }

    public String getZonaHorariaTZ() {
        return zonaHorariaTZ;
    }

    public void setZonaHorariaTZ(String zonaHorariaTZ) {
        this.zonaHorariaTZ = zonaHorariaTZ;
    }

    public String getTipoAeropuerto() {
        return tipoAeropuerto;
    }

    public void setTipoAeropuerto(String tipoAeropuerto) {
        this.tipoAeropuerto = tipoAeropuerto;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
    
    
    @Override
    public String toString(){
        return this.airportID + "\t" + this.nombre + "\t" + this.ciudad + "\t" + this.pais +"\t" + this.IATA + "\t" + this.ICAO + "\t" + this.latitud + "\t" + this.longitud + "\t" + this.altitud + "\t" + this.zonaHoraria + "\t" + this.DST + "\t" + this.zonaHorariaTZ + "\t" + this.tipoAeropuerto + "\t" + this.source;
    }
    
    @Override
    public int compareTo(Aeropuerto aeropuertoComparable) {
        return this.nombre.compareToIgnoreCase(aeropuertoComparable.getNombre());
    }
    
    
    
    
}
