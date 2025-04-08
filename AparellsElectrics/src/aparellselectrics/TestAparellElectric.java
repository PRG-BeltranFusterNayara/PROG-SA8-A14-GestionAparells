/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class TestAparellElectric {

    public static void main(String[] args) {
        Llavadora lavadora1 = new Llavadora(51, false, Color.BLANCO, ConsumoEnergetico.D, "Bosch", "V1", 20, 859, "1234A", false);
        Llavadora lavadora2 = new Llavadora(Color.BLANCO, ConsumoEnergetico.E, "Fagor", "F22", 22, 587, "1234B", true);

        Televisio tele1 = new Televisio(false, false, 45, Color.BLANCO, ConsumoEnergetico.F, "LG", "SuperGuay", 15, 286, "1234C", false);
        Televisio tele2 = new Televisio(Color.BLANCO, ConsumoEnergetico.F, "Sony", "MesChula", 86, 76543, "1234D", false);

        Portatil portatil1 = new Portatil(2048, 5000.0, 1024, false, "1234E", false);
        Portatil portatil2 = new Portatil(1024, 10000.0, 2048, false, "1234F", false);

        Movil movil1 = new Movil(Memoria.M256, "Samsung", "Galaxy S21", false, "1234F", false);
        Movil movil2 = new Movil(Memoria.M512, "Iphone", "21", false, "1234H", false);

        System.out.println("--------------------Llista d'aparells eèctrics--------------------");
        System.out.println(lavadora1);
        System.out.println(lavadora2);
        System.out.println(tele1);
        System.out.println(tele2);
        System.out.println(portatil1);
        System.out.println(portatil2);
        System.out.println(movil1);
        System.out.println(movil2);

    }
}
