/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Televisio extends Electrodomestico{

    private boolean estaWifiHabilitat;
    private boolean estaConectadaAInternet;
    private int resolucio;

    public Televisio(Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, modelo, marca, peso, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.estaWifiHabilitat = false;
        this.estaConectadaAInternet = false;
        this.resolucio = 20;
    }

    public Televisio(boolean estaWifiHabilitat, boolean estaConectadaAInternet, int resolucio, Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(color, consumo, modelo, marca, peso, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.estaWifiHabilitat = estaWifiHabilitat;
        this.estaConectadaAInternet = estaConectadaAInternet;
        this.resolucio = resolucio;
    }

    public Televisio(String modelo, String marca, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(modelo, marca, unidadesStock, numSerie, tieneCorrienteElectrica);
        this.estaWifiHabilitat = false;
        this.estaConectadaAInternet = false;
        this.resolucio = 20;

    }

    @Override
    public double obtindrePreuVenda() {
        double precioPadre = super.obtindrePreuVenda();

        if (this.resolucio > 40) {
            return (precioPadre * 0.3) + precioPadre;
        } else {
            return precioPadre;
        }

    }

    public String wifi() {
        if (this.estaWifiHabilitat) {
            return " Wifi habilitat, ";
        } else {
            return " Wifi deshabilitat, ";
        }
    }

    public String internet() {
        if (this.estaConectadaAInternet) {
            return " Connectat a Internet, ";
        } else {
            return " No connectat a Internet, ";
        }
    }

    @Override
    public String toString() {
        return "\n[Televisió] Núm.Sèrie: " + getNumSerie() + tieneCorrienteElectricaString() + encendida()
                + "Marca: " + getMarca() + ",\n Model: " + getModelo() + ", Tipus de consum: " + getConsumo()
                + ", Color: " + getColor() + ", Preu Base: " + getPrecio() + ", Preu final: " + obtindrePreuVenda()
                + wifi() + internet() + "Resolució: " + resolucio;

    }


}
