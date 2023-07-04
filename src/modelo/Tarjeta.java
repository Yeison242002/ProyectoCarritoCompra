
package modelo;

import java.time.YearMonth;

public class Tarjeta {
   
    public String numeroTarjeta;
    public String nombrePropietario;
    public String fechaExpedicion;
    public String CVV;
    
    public Tarjeta(String numeroTarjeta, String nombrePropietario, String fechaExpedicion, String Cvv) {
        this.nombrePropietario = nombrePropietario;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpedicion = fechaExpedicion;
        this.CVV = Cvv;
    }
    


    public Tarjeta() {
    }

    

    public String getNombreP() {
        return nombrePropietario;
    }

    public void setNombreP(String nombreP) {
        this.nombrePropietario = nombreP;
    }

    public String getNumTarjeta() {
        return numeroTarjeta;
    }

    public void setNumTarjeta(String numTarjeta) {
        this.numeroTarjeta = numTarjeta;
    }
     public String getFechaExp() {
        return fechaExpedicion;
    }

    public void setFechaExp(String fecExpedicion) {
        this.fechaExpedicion = fecExpedicion;
    }

    public String getCVV() {
        return CVV;
    }

    public void setCVV(String Cvv) {
        this.CVV = Cvv;
        
    }

}
