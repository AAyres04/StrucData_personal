package Modelo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Vehiculo {

    private String matricula;
    private String chasis;
    private int ejes;
    private Date fechaCompra;
    private long kilometraje;
    private long kilometrajeMantencion;
    private Date fechaUltimaMantencion;
    private Date fechaUltimoProblema;
    public Marca marca;
    public int nProblemas;

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getChasis() {
        return this.chasis;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public int getEjes() {
        return this.ejes;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public Date getFechaCompra() {
        return this.fechaCompra;
    }

    public void setKilometrajeMantencion(long kilometrajeMantencion) {
        this.kilometrajeMantencion = kilometrajeMantencion;
    }

    public long getKilometrajeMantencion() {
        return this.kilometrajeMantencion;
    }

    public void setFechaUltimaMantencion(Date fechaUltimaMantencion) {
        this.fechaUltimaMantencion = fechaUltimaMantencion;
    }

    public Date getFechaUltimaMantencion() {
        return this.fechaUltimaMantencion;
    }

    public void setFechaUltimoProblema(Date fechaUltimoProblema) {
        this.fechaUltimoProblema = fechaUltimoProblema;
    }

    public Date getFechaUltimoProblema() {
        return this.fechaUltimoProblema;
    }

    public long getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(long kilometraje) {
        this.kilometraje = kilometraje;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public int getnProblemas() {
        return nProblemas;
    }

    public void setnProblemas(int nProblemas) {
        this.nProblemas = nProblemas;
    }

    @Override
    public String toString() {
        DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        return "{" + "\"matricula\":\""+ matricula + "\", \"chasis\":" + chasis + 
                ",\"ejes\":" + ejes + ",\"fechaCompra\":" + formatter.format(fechaCompra) + 
                ",\"kilometraje\":" + kilometraje + ",\"kilometrajeMantencion\":" 
                + kilometrajeMantencion + ",\"fechaUltimaMantencion\":" + 
                formatter.format(fechaUltimaMantencion)  + ",\"fechaUltimoProblema\":" + formatter.format(fechaUltimoProblema)
                + ",\"marca\":\"" + marca + "\",\"nProblemas\":" + nProblemas + '}';
    }
}