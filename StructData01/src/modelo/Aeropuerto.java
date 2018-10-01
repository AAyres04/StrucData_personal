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
public class Aeropuerto {
    
    private String airportID;
    private String nombre;
    private String ciudad;
    private String pais;
    private String IATA;
    private String ICAO;
    private String latitud;
    private String longitud;
    private String altitud;
    private String zonaHoraria;
    private String DST; //Dayligth savings time.
    private String zonaHorariaTZ;
    private String tipoAeropuerto;
    private String source;

    public Aeropuerto(String airportID, String nombre, String ciudad, String pais, String IATA, String ICAO, String latitud, String longitud, String altitud, String zonaHoraria, String DST, String zonaHorariaTZ, String tipoAeropuerto, String source) {
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

    public Aeropuerto() {
        this.airportID = "";
        this.nombre = "";
        this.ciudad = "";
        this.pais = "";
        this.IATA = "";
        this.ICAO = "";
        this.latitud = "";
        this.longitud = "";
        this.altitud = "";
        this.zonaHoraria = "";
        this.DST = "";
        this.zonaHorariaTZ = "";
        this.tipoAeropuerto = "";
        this.source = "";
    }

    public String getAirportID() {
        return airportID;
    }

    public void setAirportID(String airportID) {
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

    public String getLatitud() {
        return latitud;
    }

    public void setLatitud(String latitud) {
        this.latitud = latitud;
    }

    public String getLongitud() {
        return longitud;
    }

    public void setLongitud(String longitud) {
        this.longitud = longitud;
    }

    public String getAltitud() {
        return altitud;
    }

    public void setAltitud(String altitud) {
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
    
    
    
}
