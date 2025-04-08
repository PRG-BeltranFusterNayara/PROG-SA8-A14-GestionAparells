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
public class Electrodomestico extends AparatoElectrico {

    private Color color;
    private ConsumoEnergetico consumo;
    private double precio;
    private String modelo;
    private String marca;
    private int peso;
    private int unidadesStock;

    public Electrodomestico(Color color, ConsumoEnergetico consumo, String modelo, String marca, int peso, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.color = color;
        this.consumo = consumo;
        this.precio = 100;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = peso;
        this.unidadesStock = unidadesStock;
    }

    public Electrodomestico(String modelo, String marca, int unidadesStock, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.color = color.BLANCO;
        this.consumo = ConsumoEnergetico.F;
        this.precio = 100;
        this.modelo = modelo;
        this.marca = marca;
        this.peso = 5;
        this.unidadesStock = unidadesStock;
    }

    public double obtindrePreuVenda() {
        double precioInicial = this.precio;
        switch (this.consumo) {
            case A -> {
                return precioInicial + 100;
            }
            case B -> {
                return precioInicial + 80;
            }
            case C -> {
                return precioInicial + 60;
            }
            case D -> {
                return precioInicial + 50;
            }
            case E -> {
                return precioInicial + 30;
            }
            case F -> {
                return precioInicial + 10;
            }
            default -> {
                return 100;
            }

        }

    }

    public Color getColor() {
        return color;
    }

    public ConsumoEnergetico getConsumo() {
        return consumo;
    }

    public double getPrecio() {
        return precio;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }

    public int getPeso() {
        return peso;
    }

    public int getUnidadesStock() {
        return unidadesStock;
    }

}
