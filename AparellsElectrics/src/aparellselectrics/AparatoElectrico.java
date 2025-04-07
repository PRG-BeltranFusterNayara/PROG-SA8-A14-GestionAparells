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

    public AparatoElectrico(String numSerie, boolean tieneCorrienteElectrica) {
        this.numSerie = numSerie;
        this.tieneCorrienteElectrica = tieneCorrienteElectrica;
    }

    public String estaEncendido() {
        if(this.tieneCorrienteElectrica){
        return "Esta encendido";
        }else{
        return "No está encendido";
        }
    } 
    
    
    
}
