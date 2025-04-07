/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Portatil extends AparatoElectrico{
    private int memoriaRam;
    private double velocidadCPU;
    private int tamanyoHD;
    

    public Portatil(int memoriaRam, double velocidadCPU, int tamanyoHD, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.memoriaRam = memoriaRam;
        this.velocidadCPU = velocidadCPU;
        this.tamanyoHD = tamanyoHD;
    }
    
    
    
}
