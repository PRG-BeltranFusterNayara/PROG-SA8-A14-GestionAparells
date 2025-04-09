/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

import java.util.HashSet;

/**
 *
 * @author batoi
 */
public class TestRegleta {

    public static void main(String[] args) {
        HashSet<Endollable> aparatos = new HashSet<Endollable>();
        Regleta regleta = new Regleta();
        
        Llavadora lavadora1 = new Llavadora(51, false, Color.BLANCO, ConsumoEnergetico.D, "Bosch", "V1", 20, 859, "1234A", false);
        Televisio tele1 = new Televisio(false, false, 45, Color.BLANCO, ConsumoEnergetico.F, "LG", "SuperGuay", 15, 286, "1234C", false);
        Portatil portatil1 = new Portatil(2048, 5000.0, 1024, false, "1234E", false);
        Movil movil1 = new Movil(Memoria.M256, "Samsung", "Galaxy S21", false, "1234F", false);

        aparatos.add((Endollable) lavadora1);
        aparatos.add((Endollable) tele1);
        aparatos.add((Endollable) portatil1);
        aparatos.add((Endollable) movil1);

        System.out.println("----------Crear regleta i connectar els quatre aparells-----------\n");
        for (Endollable aparato : aparatos){
            regleta.endollar(aparato);
        }
        
        System.out.println("\n----------Llistar aparells endollats----------");
        regleta.llistarConnectats();
        System.out.println("\nEndolls lliures:" + regleta.obtenirNumeroEnchufesLibres());
        
        
        System.out.println("\n----------Desconnectar llavadora i televisió----------\n");
        regleta.desendollar(lavadora1);
        regleta.desendollar(tele1);
        
        System.out.println("\n----------Llistar aparells endollats ----------");
        regleta.llistarConnectats();

        System.out.println("\n----------Endollar portatil anterior i obtindre missatge d'error ----------\n");
        Portatil portatil2 = new Portatil(2048, 5000.0, 1024, false, "1234E", false);
        regleta.endollar(portatil2);

        System.out.println("\n----------Desconnectar aparell no endollat (la llavadora)----------\n");
        regleta.desendollar(lavadora1);
        
    }
}
