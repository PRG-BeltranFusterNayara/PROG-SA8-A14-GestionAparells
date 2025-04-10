/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author User
 */
public class TestEncaminador {
    public static void main(String[] args) {
        Televisio tele1 = new Televisio(false, false, 45, Color.BLANCO, ConsumoEnergetico.F, "LG", "SuperGuay", 15, 286, "1234C", false);
        Portatil portatil1 = new Portatil(2048, 5000.0, 1024, true, "1234E", true);
        Movil movil1 = new Movil(Memoria.M256, "Samsung", "Galaxy S21", true, "1234F", true);

        System.out.println("---------- Aparells connectables creats ---------\n");
        System.out.println(tele1);
        System.out.println(portatil1);
        System.out.println(movil1);
        
        
        System.out.println("\n--------------------Encendre televisió, mòbil i portàtil ---------\n");        
        System.out.println("[Televisiò] "+tele1.encendida());
        System.out.print("[Mòvil] ");
        movil1.activar();
        System.out.print("[Portàtil] ");
        portatil1.activar();
        
        System.out.println("\n----------Connectar televisió a una regleta i encendre la TV ----------\n");
        Regleta regleta = new Regleta();
        
        regleta.endollar(tele1);
        System.out.print("[Televisiò]: ");
        tele1.activar();
        
        
        System.out.println("\n----------Crear encaminador i aparellar els tres aparells. Televisió no podrà tindre habilitat Wifi----------\n");
        Encaminador router= new Encaminador("1234Z", true);
        regleta.endollar(router);
        router.emparejar(tele1);
        router.emparejar(portatil1);
        router.emparejar(movil1);

        System.out.println("\n----------Habilitar Wifi per a televisió i aparellar amb encaminador ----\n");
        tele1.setEstaWifiHabilitat(true);
        router.emparejar(tele1);
        
        System.out.println("\n----------Desaparellar mòbil i mostrar els aparells aparellats ----------\n");
        
        router.desemparejar(movil1);
        router.llistarDispositiusAparellats();
        
        System.out.println("\n----------Desendollar televisió i llistar aparells aparellats ----------\n");
        regleta.desendollar(tele1);
        router.actualizarDispositivosEmparejados();
        router.llistarDispositiusAparellats();
        
        
        
    }
    
}
