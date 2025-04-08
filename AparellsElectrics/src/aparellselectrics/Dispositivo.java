/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aparellselectrics;

/**
 *
 * @author batoi
 */
public class Dispositivo extends AparatoElectrico {

    private boolean conectadoAInternet;

    public Dispositivo(String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.conectadoAInternet = false;
    }

    public Dispositivo(boolean conectadoAInternet, String numSerie, boolean tieneCorrienteElectrica) {
        super(numSerie, tieneCorrienteElectrica);
        this.conectadoAInternet = conectadoAInternet;
    }

    public boolean isConectadoAInternet() {
        return conectadoAInternet;
    }
    
        
        public String internet() {
        if(this.conectadoAInternet) {
            return " Connectat a Internet, ";
        } else {
            return " No connectat a Internet, ";
        }

}
}