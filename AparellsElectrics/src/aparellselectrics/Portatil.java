/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Portatil extends Dispositivo{
    private int memoriaRam;
    private double velocidadCPU;
    private int tamanyoHD;


    public Portatil(int memoriaRam, double velocidadCPU, int tamanyoHD, boolean conectadoAInternet, String numSerie, boolean tieneCorrienteElectrica) {
        super(conectadoAInternet, numSerie, tieneCorrienteElectrica);
        this.memoriaRam = memoriaRam;
        this.velocidadCPU = velocidadCPU;
        this.tamanyoHD = tamanyoHD;
    }


       
    
    
public String toString(){
        return "\n[Portàtil] Núm.Sèrie: "+ getNumSerie() + tieneCorrienteElectricaString();
                
                
                }
    

  
    
    
    
}
