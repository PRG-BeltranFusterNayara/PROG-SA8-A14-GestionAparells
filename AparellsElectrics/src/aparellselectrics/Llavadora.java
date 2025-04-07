/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Llavadora extends Electrodomestico {

    private int carga;
    private boolean estaEncesa;

    public Llavadora(int carga, boolean estaEncesa, Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, modelo, marca, peso, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.carga = carga;
        this.estaEncesa = estaEncesa;
    }

    public Llavadora(Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, modelo, marca, peso, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.carga = 7;
        this.estaEncesa = false;

    }

    public Llavadora(String modelo, String marca, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(modelo, marca, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.carga = 7;
        this.estaEncesa = false; 
        
    }
    

    public double obtindrePreuVenda() {
       double precioPadre= super.obtindrePreuVenda();
       
        if (this.carga > 50) {
            return precioPadre+50;
        } else {
            return precioPadre;
        }

    }
}
