/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Movil extends AparatoElectrico {
    private Memoria memoria;
    private String marca;
    private String modelo;

    public Movil(Memoria memoria, String marca, String modelo, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.memoria = memoria;
        this.marca = marca;
        this.modelo = modelo;
    }
    
    
    
}
