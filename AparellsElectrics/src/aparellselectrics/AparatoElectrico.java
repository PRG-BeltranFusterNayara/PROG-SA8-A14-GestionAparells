/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

import java.util.Objects;

/**
 *
 * @author batoi
 */
abstract class AparatoElectrico implements Endollable{

    private String numSerie;
    private boolean tieneCorrienteElectrica;
    private boolean estaEncendido;

    public AparatoElectrico(String numSerie, boolean tieneCorrienteElectrica) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = tieneCorrienteElectrica;
    }

    public String tieneCorrienteElectricaString() {
        if (this.tieneCorrienteElectrica) {
            return " (Corrent elèctric funcionant),";
        } else {
            return " (Sense corrent elèctric),";
        }
    }

    public String getNumSerie() {
        return numSerie;
    }

    public boolean isTieneCorrienteElectrica() {
        return tieneCorrienteElectrica;
    }

    public boolean isEstaEncendido() {
        return estaEncendido;
    }

    public String encendida() {
        if (this.estaEncendido) {
            return " Aparell encès.";
        } else {
            return " No es pot encendre (no hi ha corrent).";
        }
    }

    public void setNumSerie(String numSerie) {
        this.numSerie = numSerie;
    }

    public void setTieneCorrienteElectrica(boolean tieneCorrienteElectrica) {
        this.tieneCorrienteElectrica = tieneCorrienteElectrica;
    }

    public void setEstaEncendido(boolean estaEncendido) {
        this.estaEncendido = estaEncendido;
    }
    
    @Override
    public void donarEnergia(){
    tieneCorrienteElectrica = true;
    };  
    
    public void llevarEnergia(){
    tieneCorrienteElectrica= false;    
    };

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.numSerie);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AparatoElectrico other = (AparatoElectrico) obj;
        return Objects.equals(this.numSerie, other.numSerie);
    }
    
    
    
    
}
