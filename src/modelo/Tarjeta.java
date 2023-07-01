
package modelo;

import java.time.YearMonth;

public class Tarjeta {
   
    private long numeroTarjeta;
    private String nombrePropietario;
    private YearMonth fechaExpedicion;
    private int CVV;
    
    public Tarjeta(long numeroTarjeta, String nombrePropietario, YearMonth fechaExpedicion, int Cvv) {
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpedicion = fechaExpedicion;
        this.CVV = CVV;
    }

    public Tarjeta() {
    }

    public String getNombreP() {
        return nombrePropietario;
    }

    public void setNombreP(String nombreP) {
        this.nombrePropietario = nombrePropietario;
    }

    public long getNumTarjeta() {
        return numeroTarjeta;
    }

    public void setNumTarjeta(long numTarjeta) {
        this.numeroTarjeta = numTarjeta;
    }
     public YearMonth getFechaExp() {
        return fechaExpedicion;
    }

    public void setFechaExp(YearMonth fecExpedicion) {
        this.fechaExpedicion = fecExpedicion;
    }

    public long getCVV() {
        return CVV;
    }

    public void setId(int CVV) {
        this.CVV = CVV;
    }

}
