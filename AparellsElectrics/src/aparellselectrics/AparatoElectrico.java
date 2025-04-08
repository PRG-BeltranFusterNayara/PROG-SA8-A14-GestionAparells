/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
abstract class AparatoElectrico {
    private String numSerie;
    private boolean tieneCorrienteElectrica;
    private boolean estaEncendido;

    public AparatoElectrico(String numSerie, boolean tieneCorrienteElectrica) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = tieneCorrienteElectrica;
    }

    public String tieneCorrienteElectricaString() {
        if(this.tieneCorrienteElectrica){
        return " (Corrent elèctric funcionant),";
        }else{
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
        if(this.estaEncendido){
        return " Esta encesa, ";
        }else{
        return " No està encès, ";
        }
       }     
  
    
}
