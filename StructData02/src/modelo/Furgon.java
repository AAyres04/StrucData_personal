/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author zeiruos
 */
public class Furgon {
    private String patente;
    private int chasis;
    private int ejes;
    private String marca;
    private int actualKM;
    private int mantencionKM;
    private String compra_date;
    private String matencion_date;
    private String problema_date;
    private int nProblemas;

    public Furgon(){
        
    }

    public Furgon(String patente, int chasis, int ejes, String marca, int actualKM, int mantencionKM, String compra_date, String matencion_date, String problema_date, int nProblemas) {
        this.patente = patente;
        this.chasis = chasis;
        this.ejes = ejes;
        this.marca = marca;
        this.actualKM = actualKM;
        this.mantencionKM = mantencionKM;
        this.compra_date = compra_date;
        this.matencion_date = matencion_date;
        this.problema_date = problema_date;
        this.nProblemas = nProblemas;
    }
    
    
    
    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public int getChasis() {
        return chasis;
    }

    public void setChasis(int chasis) {
        this.chasis = chasis;
    }

    public int getEjes() {
        return ejes;
    }

    public void setEjes(int ejes) {
        this.ejes = ejes;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getActualKM() {
        return actualKM;
    }

    public void setActualKM(int actualKM) {
        this.actualKM = actualKM;
    }

    public int getMantencionKM() {
        return mantencionKM;
    }

    public void setMantencionKM(int mantencionKM) {
        this.mantencionKM = mantencionKM;
    }

    public String getCompra_date() {
        return compra_date;
    }

    public void setCompra_date(String compra_date) {
        this.compra_date = compra_date;
    }

    public String getMatencion_date() {
        return matencion_date;
    }

    public void setMatencion_date(String matencion_date) {
        this.matencion_date = matencion_date;
    }

    public String getProblema_date() {
        return problema_date;
    }

    public void setProblema_date(String problema_date) {
        this.problema_date = problema_date;
    }

    public int getnProblemas() {
        return nProblemas;
    }

    public void setnProblemas(int nProblemas) {
        this.nProblemas = nProblemas;
    }
    
    @Override
    public String toString(){
        return this.patente + "\t" + this.marca;
        
    }
    
    
    
}
