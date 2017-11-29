package model;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author JuliannyAS
 */
public class Locacao {
    
    private ArrayList<Imovel> imoveis;
    private ArrayList<Locatario> locatarios;
    private int numContrato;
    private Date inicioContrato;
    private Date terminoContrato;
    private int diaVencimento;
    private float valorAlguel;
    private int tolerandiaDia;

    public ArrayList<Imovel> getImoveis() {
        return imoveis;
    }

    public void setImoveis(ArrayList<Imovel> imoveis) {
        this.imoveis = imoveis;
    }

    public ArrayList<Locatario> getLocatarios() {
        return locatarios;
    }

    public void setLocatarios(ArrayList<Locatario> locatarios) {
        this.locatarios = locatarios;
    }

    public int getNumContrato() {
        return numContrato;
    }

    public void setNumContrato(int numContrato) {
        this.numContrato = numContrato;
    }

    public Date getInicioContrato() {
        return inicioContrato;
    }

    public void setInicioContrato(Date inicioContrato) {
        this.inicioContrato = inicioContrato;
    }

    public Date getTerminoContrato() {
        return terminoContrato;
    }

    public void setTerminoContrato(Date terminoContrato) {
        this.terminoContrato = terminoContrato;
    }

    public int getDiaVencimento() {
        return diaVencimento;
    }

    public void setDiaVencimento(int diaVencimento) {
        this.diaVencimento = diaVencimento;
    }

    public float getValorAlguel() {
        return valorAlguel;
    }

    public void setValorAlguel(float valorAlguel) {
        this.valorAlguel = valorAlguel;
    }

    public int getTolerandiaDia() {
        return tolerandiaDia;
    }

    public void setTolerandiaDia(int tolerandiaDia) {
        this.tolerandiaDia = tolerandiaDia;
    }
    
    
}
