/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aparellselectrics;

import static aparellselectrics.ConsumoEnergetico.B;

/**
 *
 * @author batoi
 */
public class Electrodomestico extends AparatoElectrico{
    private Color color;
    private ConsumoEnergetico consumo;
    private double precio;
    private String modelo;
    private String marca;
    private int peso;
    private int unidadesStock;

    public Electrodomestico(String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
    }

    public Electrodomestico(Color color, ConsumoEnergetico consumo, double precio, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.color=(color !=null) ? color : color.BLANCO;
        this.consumo = (consumo !=null) ? consumo : ConsumoEnergetico.F;
        this.precio = obtindrePreuVenda();
        this.modelo = modelo;
        this.marca = marca;
        this.peso = (peso > 0) ? peso : 5;
        this.unidadesStock = unidadesStock;
    }
    
    public double obtindrePreuVenda(){
        double precioInicial=100; 
        switch (this.consumo) {
            case A -> {
                return precioInicial+100;
            }
            case B -> {
                return precioInicial+80;
            }
            case C -> {
                return precioInicial+60;
            }
            case D -> {
                return precioInicial+50;
            }
            case E -> {
                return precioInicial+30;
            }
            case F -> {
                return precioInicial+10;
            }
            default ->{
            return 100;
            }
                
        }
    
    }
    
    
    
}
