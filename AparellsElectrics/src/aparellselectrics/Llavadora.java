/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author User
 */
public class Llavadora extends Electrodomestico {
    
    private int carga;
    public Llavadora(int carga, boolean estaEncesa, Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, modelo, marca, peso, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.carga = carga;
    }

    public Llavadora(Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, modelo, marca, peso, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.carga = 7;

    }

    public Llavadora(String modelo, String marca, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(modelo, marca, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.carga = 7;        
    }
    

    public double obtindrePreuVenda() {
       double precioPadre= super.obtindrePreuVenda();
       
        if (this.carga > 50) {
            return precioPadre+50;
        } else {
            return precioPadre;
        }

    }
    
    @Override
        public String toString(){
        return "\n[Llavadora] Núm.Sèrie: "+ getNumSerie() + tieneCorrienteElectricaString()+ encendida()+ 
                "Marca: " + getMarca() + ",\n Model: " + getModelo() + ", Tipus de consum: " + getConsumo() + 
                ", Color: " + getColor()+ ", Preu Base: " + getPrecio() + ", Preu final: "+ obtindrePreuVenda()+
               ", Carrega: " + carga;
                
                }
    
}
